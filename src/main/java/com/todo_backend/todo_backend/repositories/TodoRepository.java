package com.todo_backend.todo_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo_backend.todo_backend.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    
}

