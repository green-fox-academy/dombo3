package com.greenfoxacademy.controllers;

import com.greenfoxacademy.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  @RequestMapping("/exercise1")
  public String bankAccount(Model model) {
    BankAccount account = new BankAccount("Simba", "2000", "lion");
    model.addAttribute("bankaccount", account);
    return "exercise1";
  }
}
