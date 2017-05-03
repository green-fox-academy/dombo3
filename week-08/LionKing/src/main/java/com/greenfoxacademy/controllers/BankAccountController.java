package com.greenfoxacademy.controllers;

import com.greenfoxacademy.model.BankAccount;
import com.greenfoxacademy.model.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  @RequestMapping("/exercise1")
  public String bankAccount(Model model) {
    BankAccount account = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("bankaccount", account);
    return "exercise1";
  }

  @GetMapping("/form")
  public String userForm(Model model){
    model.addAttribute("result", new Result());
    return "submit";
  }

  @PostMapping("/result")
  public String result(@ModelAttribute Result result) {
    return "result";
  }
}
