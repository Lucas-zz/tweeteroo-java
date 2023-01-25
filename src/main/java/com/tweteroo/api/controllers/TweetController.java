package com.tweteroo.api.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.TweetDTO;
import com.tweteroo.api.models.TweetModel;
import com.tweteroo.api.services.TweetService;
import com.tweteroo.api.services.UserService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/tweets")
public class TweetController {

    @Autowired
    private TweetService tweetService;

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<String> createTweet(@RequestBody @Valid TweetDTO req) {
        boolean userExists = userExists(req.username());

        System.out.println(req);

        if (userExists) {
            tweetService.createTweet(req);
            return ResponseEntity.status(HttpStatus.CREATED).body("OK");
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("You need to be signed up to post a tweet.");
    }

    @GetMapping
    public Page<TweetModel> getAllTweets(@PageableDefault(page = 0, size = 5) Pageable page) {
        return tweetService.getAllTweets(page);
    }

    @GetMapping("/{username}")
    public List<TweetModel> getTweetsByUsername(@PathVariable String username) {
        return tweetService.getTweetsByUsername(username);
    }

    private boolean userExists(String username) {
        return userService.getUserByUsername(username);
    }
}
