package com.java.spring.api.tasks.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.api.tasks.models.Task;
import com.java.spring.api.tasks.repositorys.TaskRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/tasks")
public class TaskController {
    
    private TaskRepository repository;

    TaskController(TaskRepository repository) {
        this.repository = repository;
    }

    @PostMapping(value = "/save")
    public Task save(@Valid Task task) {
        return repository.save(task);
    }

    @GetMapping(value = "/list")
    public List<Task> list() {
        return repository.findAll();
    }

    @GetMapping(value = "/find/{id}")
    public Task find(@PathVariable("id") Long id) {
        Task task = repository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid task id: " + id));

        return task;
    } 
}