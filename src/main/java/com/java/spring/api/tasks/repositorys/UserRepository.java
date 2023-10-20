package com.java.spring.api.tasks.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.spring.api.tasks.models.User;

public interface UserRepository extends JpaRepository<User, Long> {}