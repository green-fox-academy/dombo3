package com.greenfox.todosql.controllers;

import com.greenfox.todosql.model.Account;
import com.greenfox.todosql.model.Todo;
import com.greenfox.todosql.repository.AccountRepository;
import com.greenfox.todosql.repository.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class TodoController {
  AccountController accountController;
  TodoRepository todoRepo;
  AccountRepository accountRepo;

  @Autowired
  public TodoController(TodoRepository todoRepo, AccountRepository accountRepo) {
    this.todoRepo = todoRepo;
    this.accountRepo = accountRepo;
  }

  @RequestMapping(value = "/todo")
  public String list(Model model, @RequestParam(value = "isActive", required = false, defaultValue = "false") String isActive) {
    if (isActive.equals("true")) {
      model.addAttribute("todos", todoRepo.findAllByisDoneTrue());
    } else {
      model.addAttribute("todos", todoRepo.findAll());
//      model.addAttribute("todos", todoRepo.findAllByAccountUsername("dombo3"));
    }

    System.out.println(accountController.getAccount().getUsername() + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

    return "todo";
  }

  @GetMapping(value = "/todo/add")
  public String getAddForm(Model model) {
//    Account account = (Account) model.asMap().get("account");
    model.addAttribute("todo", new Todo(accountController.getAccount()));
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

  @GetMapping(value = "/signup")
  public String getSignUp() {
    return "signup";
  }

  @PostMapping(value = "/signup")
  public String signup(@RequestParam(name="username") String username, @RequestParam(name="password") String password) {
    accountRepo.save(new Account(username,password));
    return "redirect:/login";
  }

  @GetMapping(value = "/login")
  public String getLogin() {
    return "login";
  }

  @PostMapping(value = "/login")
  public String login(Model model, @RequestParam(name="username") String username, @RequestParam(name="password") String password) {
    // validate user
    // exception handling if user not found
    model.addAttribute("account", accountRepo.findByUsername(username));
    accountController.setAccount(accountRepo.findByUsername(username));
    return "redirect:/todo";
  }
}
