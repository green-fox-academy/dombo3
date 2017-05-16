package com.greenfox.todosql.controllers;

import com.greenfox.todosql.model.Todo;
import com.greenfox.todosql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  TodoRepository todoRepo;

  @Autowired
  public TodoController(TodoRepository todoRepo) {
    this.todoRepo = todoRepo;
  }

  @RequestMapping(value = "/todo")
  public String list(Model model,@RequestParam(value = "isActive", required = false, defaultValue = "false") String isActive) {
    if (isActive.equals("true")) {
      model.addAttribute("todos", todoRepo.findAllByisDoneTrue());
    } else {
      model.addAttribute("todos", todoRepo.findAll());
    }
    return "todo";
  }

  @GetMapping(value = "/todo/add")
  public String getAddForm(Model model) {
    model.addAttribute("todo", new Todo());
    return "add";
  }

  @PostMapping(value = "/todo/add")
  public String add(@ModelAttribute Todo todo) {
    todoRepo.save(todo);
    return "redirect:/todo";
  }

  @GetMapping(value = "/todo/{id}/delete")
  public String delete(@PathVariable long id) {
    todoRepo.delete(id);
    return "redirect:/todo";
  }

  @GetMapping(value = "/todo/{id}/edit")
  public String getEditForm(Model model, @PathVariable long id) {
    model.addAttribute("todo", todoRepo.findOne(id));
    return "edit";
  }

  @PostMapping(value = "/todo/{id}/edit")
  public String edit(@PathVariable long id, @RequestParam(name="title") String title, @RequestParam(name="urgent", required = false) boolean urgent, @RequestParam(name="done", required = false) boolean done) {
    Todo todo = todoRepo.findOne(id);
    todo.setTitle(title);
    todo.setUrgent(urgent);
    todo.setDone(done);
    todoRepo.save(todo);
    return "redirect:/todo";
  }
}
