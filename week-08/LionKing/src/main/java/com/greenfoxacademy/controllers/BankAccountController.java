package com.greenfoxacademy.controllers;

import com.greenfoxacademy.model.BankAccount;
import com.greenfoxacademy.model.Result;
import java.util.ArrayList;
import java.util.List;
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

  @RequestMapping("/exercise5")
  public String accountsArray(Model model) {
    List<BankAccount> animalAccounts = new ArrayList<>();
    animalAccounts.add(new BankAccount("Nala",1000, "lion"));
    animalAccounts.add(new BankAccount("Zordon",500, "lion"));
    animalAccounts.add(new BankAccount("Mufasa",200, "lion"));
    animalAccounts.add(new BankAccount("Timon",900, "suricata"));
    animalAccounts.add(new BankAccount("Pumba",2,"warthog"));
    model.addAttribute("accounts", animalAccounts);
    return "exercise5";
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