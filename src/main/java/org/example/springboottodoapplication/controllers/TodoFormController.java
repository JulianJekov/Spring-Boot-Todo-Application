package org.example.springboottodoapplication.controllers;

import jakarta.validation.Valid;
import org.example.springboottodoapplication.controllers.models.CreateTodoItemDto;
import org.example.springboottodoapplication.models.TodoItem;
import org.example.springboottodoapplication.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TodoFormController {

    private final TodoItemService todoItemService;

    @Autowired
    public TodoFormController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    @GetMapping("/create-todo")
    public String showCreateForm(TodoItem todoItem) {
        return "new-todo-item";
    }

    @PostMapping("/todo")
    public String createTodoItem(@Valid CreateTodoItemDto todoItemDto, BindingResult result, Model model) {
        this.todoItemService.createTodoItem(todoItemDto);
        return "redirect:/";
    }
}
