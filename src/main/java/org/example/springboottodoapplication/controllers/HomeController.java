package org.example.springboottodoapplication.controllers;

import org.example.springboottodoapplication.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    private final TodoItemService todoItemService;

    @Autowired
    public HomeController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    @GetMapping("/")
    public ModelAndView index () {
        final ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("todoItems", this.todoItemService.getAll());
        return modelAndView;
    }
}
