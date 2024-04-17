package org.example.springboottodoapplication.service;

import org.example.springboottodoapplication.models.TodoItem;

import java.util.List;
import java.util.Optional;

public interface TodoItemService {
    List<TodoItem> getAll();
    Optional <TodoItem> getById(Long id);

    TodoItem save(TodoItem todoItem);

    void delete (TodoItem todoItem);
}
