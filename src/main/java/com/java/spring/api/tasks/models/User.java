package com.java.spring.api.tasks.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "user_table")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "The field cannot be null!")
    @NotBlank(message = "The field cannot be blank!")
    private String userName;

    @Email
    private String userEmail;

    @NotNull(message = "The field cannot be null!")
    @NotBlank(message = "The field cannot be blank!")
    @Size(min = 6)
    private String userPassword;
}