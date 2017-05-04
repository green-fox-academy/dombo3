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

  List<BankAccount> animalAccounts = new ArrayList<>();

  @ModelAttribute
  public void add(Model model) {
    animalAccounts.add(new BankAccount("Nala",1000, "lion"));
    animalAccounts.add(new BankAccount("Zordon",500, "lion"));
    animalAccounts.add(new BankAccount("Mufasa",200, "lion"));
    animalAccounts.add(new BankAccount("Timon",900, "suricata"));
    animalAccounts.add(new BankAccount("Pumba",2,"warthog"));
    model.addAttribute("accounts", animalAccounts);
  }

  @RequestMapping("/exercise1")
  public String bankAccount(Model model) {
    BankAccount account = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("bankaccount", account);
    return "exercise1";
  }

  @RequestMapping("/exercise5")
  public String accountsArray(Model model) {
    animalAccounts.get(2).setKing(true);
    animalAccounts.get(1).setGoodGuy(false);
    return "exercise5";
  }

  @RequestMapping("/exercise10")
  public String savannaAccountForm(Model model) {
    return "exercise10";
  }

  @RequestMapping("/click")
  public String click(@ModelAttribute BankAccount account) {
    account.setZebras(10);
    System.out.println(account.getZebras());
    return "redirect:exercise10";
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
