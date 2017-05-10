package com.greenfox.todosql.controllers;

import com.greenfox.todosql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoRepository todoRepo;

  @Autowired
  public TodoController(TodoRepository todoRepo) {
    this.todoRepo = todoRepo;
  }

  @RequestMapping(value = {"/","/list",""})
  public String list(Model model,@RequestParam(value = "isActive", required = false, defaultValue = "false") String isActive) {
    if (isActive.equals("true")) {
      model.addAttribute("todos", todoRepo.findAllByisDoneTrue());
    } else {
      model.addAttribute("todos", todoRepo.findAll());
    }
    return "todo";
  }
}
