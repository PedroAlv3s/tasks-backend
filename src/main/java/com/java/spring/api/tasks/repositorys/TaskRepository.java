package com.java.spring.api.tasks.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.spring.api.tasks.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {}