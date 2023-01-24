package com.tweteroo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.TweetDTO;
import com.tweteroo.api.services.TweetService;
import com.tweteroo.api.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    @Autowired
    private TweetService tweetService;

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<String> createTweet(@RequestBody @Valid TweetDTO req) {
        boolean userExists = userService.findUserByUsername(req.username());

        if (userExists) {
            tweetService.createTweet(req);
            return ResponseEntity.status(HttpStatus.CREATED).body("OK");
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("You need to be signed up to post a tweet.");
    }
}
