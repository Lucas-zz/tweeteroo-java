package com.tweteroo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.UserDTO;
import com.tweteroo.api.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/sign-up")
public class SignUpController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody @Valid UserDTO req) {
        boolean userExists = service.findUserByUsername(req.username());

        if (userExists) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("User already exists.");
        }

        service.createUser(req);

        return ResponseEntity.status(HttpStatus.CREATED).body("OK");
    }
}
