package com.java.spring.api.tasks.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.api.tasks.models.Task;

@RestController
@RequestMapping(value = "/tasks")
public class TaskController {
    
    @GetMapping(value = "/list")
    public List<Task> list() {
        return findAll();
    } 
}