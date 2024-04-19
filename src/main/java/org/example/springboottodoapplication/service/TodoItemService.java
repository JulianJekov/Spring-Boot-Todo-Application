package org.example.springboottodoapplication.service;

import org.example.springboottodoapplication.controllers.models.CreateTodoItemDto;
import org.example.springboottodoapplication.controllers.models.EditTodoItemDto;
import org.example.springboottodoapplication.models.TodoItem;

import java.util.List;
import java.util.Optional;

public interface TodoItemService {
    List<TodoItem> getAll();
    TodoItem getById(Long id);

    TodoItem save(TodoItem todoItem);

    void delete (TodoItem todoItem);

    void editTodoItem(Long id, EditTodoItemDto todoItemDto);

    void createTodoItem(CreateTodoItemDto todoItemDto);
}
