package com.greenfoxacademy.controllers;

import com.greenfoxacademy.model.BankAccount;
import com.greenfoxacademy.model.BankAccounts;
import com.greenfoxacademy.model.Result;
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
public class BankAccountController {

  BankAccounts bankAccounts;

  @Autowired
  public BankAccountController(BankAccounts bankAccounts) {
    this.bankAccounts = bankAccounts;
  }

  @ModelAttribute
  public void add(Model model) {

    model.addAttribute("accounts", bankAccounts.getAccounts());
  }

  @RequestMapping("/exercise1")
  public String bankAccount(Model model) {
    BankAccount account = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("bankaccount", account);
    return "exercise1";
  }

  @RequestMapping("/exercise5")
  public String accountsArray(Model model) {
    bankAccounts.getAccounts().get(2).setKing(true);
    bankAccounts.getAccounts().get(1).setGoodGuy(false);
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

  @PostMapping("/click2")
  public String click2(@RequestParam("index") String index) {
    BankAccount account = bankAccounts.getAccounts().get(Integer.parseInt(index));
    float balance = account.getBalance();
    account.setBalance(balance + 10);
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
