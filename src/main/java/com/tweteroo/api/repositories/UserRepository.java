package com.tweteroo.api.repositories;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.api.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    List<UserModel> findByUsername(String username);
}
