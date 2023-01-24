package com.tweteroo.api.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dto.UserDTO;
import com.tweteroo.api.models.UserModel;
import com.tweteroo.api.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void createUser(UserDTO data) {
        repository.save(new UserModel(data));
    }

    public boolean findUserByUsername(String username) {
        List<UserModel> user = repository.findByUsername(username);

        return !user.isEmpty();
    }
}