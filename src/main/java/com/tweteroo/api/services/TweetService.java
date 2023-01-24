package com.tweteroo.api.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dto.TweetDTO;
import com.tweteroo.api.models.TweetModel;
import com.tweteroo.api.models.UserModel;
import com.tweteroo.api.repositories.TweetRepository;
import com.tweteroo.api.repositories.UserRepository;

@Service
public class TweetService {

    @Autowired
    private TweetRepository tweetRepository;

    @Autowired
    private UserRepository userRepository;

    public void createTweet(TweetDTO req) {
        List<UserModel> user = userRepository.findByUsername(req.username());
        tweetRepository.save(new TweetModel(req, user.get(0).getAvatar()));
    }
}
