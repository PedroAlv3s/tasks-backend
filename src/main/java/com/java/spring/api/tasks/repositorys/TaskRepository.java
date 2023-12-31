package com.java.spring.api.tasks.repositorys;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.spring.api.tasks.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

    public List<Task> findAll();
    public Optional<Task> findById(Long id);
    public <TaskTemp extends Task> TaskTemp save(TaskTemp task);
    public void delete(Task task);
    public void deleteById(Long id);
}