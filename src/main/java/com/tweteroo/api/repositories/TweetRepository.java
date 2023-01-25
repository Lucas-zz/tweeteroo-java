package com.tweteroo.api.repositories;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tweteroo.api.models.TweetModel;

public interface TweetRepository extends JpaRepository<TweetModel, Long> {

    @Query("SELECT t FROM TweetModel t WHERE t.username = ?1")
    List<TweetModel> findByUsername(String username);
}
