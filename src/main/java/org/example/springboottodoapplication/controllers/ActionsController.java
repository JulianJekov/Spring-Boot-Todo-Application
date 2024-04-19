package org.example.springboottodoapplication.controllers;

import jakarta.validation.Valid;
import org.example.springboottodoapplication.controllers.models.EditTodoItemDto;
import org.example.springboottodoapplication.models.TodoItem;
import org.example.springboottodoapplication.service.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ActionsController {

    private final TodoItemService todoItemService;

    @Autowired
    public ActionsController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
    }

    @GetMapping("/delete/{id}")
    public String deleteTodoItem(@PathVariable("id") Long id, Model model, RedirectAttributes redirectAttributes) {
        TodoItem todoItem = this.todoItemService.getById(id);

        this.todoItemService.delete(todoItem);

        redirectAttributes.addFlashAttribute("deleteMessage", "TodoItem deleted successfully.");

        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        final TodoItem todoItem = this.todoItemService.getById(id);

        model.addAttribute("todo", todoItem);

        return "edit-todo-item";
    }

    @PostMapping("/todo/{id}")
    public String editTodoItem(@PathVariable("id") Long id,
                               @Valid EditTodoItemDto todoItemDto,
                               BindingResult result, Model model,
                               RedirectAttributes redirectAttributes) {
        this.todoItemService.editTodoItem(id, todoItemDto);
        redirectAttributes.addFlashAttribute("successMessage", "TodoItem updated successfully.");
        return "redirect:/";
    }
}
