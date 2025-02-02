package com.todo_backend.todo_backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    
    @Id
    @GeneratedValue
    private Long id;

    private String description;
    
    private boolean isCompleted;
}
