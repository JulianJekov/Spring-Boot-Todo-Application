package org.example.springboottodoapplication.service;

import org.example.springboottodoapplication.controllers.models.CreateTodoItemDto;
import org.example.springboottodoapplication.controllers.models.EditTodoItemDto;
import org.example.springboottodoapplication.models.TodoItem;
import org.example.springboottodoapplication.repository.TodoItemRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class TodoItemServiceImpl implements TodoItemService {

    private final TodoItemRepository todoItemRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public TodoItemServiceImpl(TodoItemRepository todoItemRepository, ModelMapper modelMapper) {
        this.todoItemRepository = todoItemRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<TodoItem> getAll() {
        return this.todoItemRepository.findAll();
    }

    @Override
    public TodoItem getById(Long id) {
        return this.todoItemRepository.findById(id).
                orElseThrow((() -> new IllegalArgumentException("TodoItem with id: " + id + " not found!")));
    }

    @Override
    public TodoItem save(TodoItem todoItem) {
        if (todoItem.getId() == null) {
            todoItem.setCreatedAt(Instant.now());
        }

        todoItem.setUpdatedAt(Instant.now());
        return this.todoItemRepository.save(todoItem);
    }

    @Override
    public void delete(TodoItem todoItem) {
        this.todoItemRepository.delete(todoItem);
    }

    @Override
    public void editTodoItem(Long id, EditTodoItemDto todoItemDto) {

        final TodoItem item = this.getById(id);
        this.modelMapper.map(todoItemDto, item);

        this.save(item);
    }

    @Override
    public void createTodoItem(CreateTodoItemDto todoItemDto) {
        final TodoItem todoItem = this.modelMapper.map(todoItemDto, TodoItem.class);
        this.save(todoItem);
    }
}
