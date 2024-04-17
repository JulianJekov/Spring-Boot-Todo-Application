package org.example.springboottodoapplication.service;

import org.example.springboottodoapplication.models.TodoItem;
import org.example.springboottodoapplication.repository.TodoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class TodoItemServiceImpl implements TodoItemService {

    private final TodoItemRepository todoItemRepository;

    @Autowired
    public TodoItemServiceImpl(TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }

    @Override
    public List<TodoItem> getAll() {
        return this.todoItemRepository.findAll();
    }

    @Override
    public Optional<TodoItem> getById(Long id) {
        return this.todoItemRepository.findById(id);
    }

    @Override
    public TodoItem save(TodoItem todoItem) {
        if(todoItem.getId() == null) {
            todoItem.setCreatedAt(Instant.now());
        }

        todoItem.setUpdatedAt(Instant.now());
        return this.todoItemRepository.save(todoItem);
    }

    @Override
    public void delete(TodoItem todoItem) {
        this.todoItemRepository.delete(todoItem);
    }


}
