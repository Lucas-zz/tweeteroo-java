package com.tweteroo.api.models;

import com.tweteroo.api.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class TweetModel {

    public TweetModel(TweetDTO req, String avatar) {
        this.username = req.username();
        this.tweet = req.tweet();
        this.avatar = avatar;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 16, nullable = false)
    private String username;

    @Column(length = 200, nullable = false)
    private String tweet;

    @Column(length = 200, nullable = false)
    private String avatar;
}
