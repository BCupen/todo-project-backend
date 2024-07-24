package com.todo_backend.todo_backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todo_backend.todo_backend.models.Todo;
import com.todo_backend.todo_backend.repositories.TodoRepository;

@RestController
public class TodoController {
    
    @Autowired
    private TodoRepository todoRepository;

    @PostMapping("/todo")
    public Todo createTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }

    @GetMapping("/todo")
    public String getTodo() {
        return "Todos";
    }
}
