package com.example.taskmanagerfullstack.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public String title;
    public String description;

    public boolean status;

    public LocalDateTime createdAt = LocalDateTime.now();

}
