package com.java.spring.api.tasks.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.api.tasks.models.User;
import com.java.spring.api.tasks.repositorys.UserRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {
    
    private UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping(value = "/save")
    public User save(@Valid User user) {
        return repository.save(user);
    }
}