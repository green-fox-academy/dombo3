package com.greenfoxacademy.controllers;

import com.greenfoxacademy.model.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankAccountController {

  List<BankAccount> accounts = new ArrayList<>();

  @PostMapping("/addBankAccount")
  public String addBankAccount(@ModelAttribute("account") BankAccount account) {
    accounts.add(account);
    return "bankAccountView";
  }

  @GetMapping("/addBankAccount")
  public String view() {
    return "bankAccountView";
  }

  @PostMapping("/click")
  public String setZebra(@RequestParam("index") String param) {
    accounts.get((Integer) Integer.parseInt(param)).addZebra();
    return "bankAccountView";
  }

  @ModelAttribute
  public void addAttributes(Model model) {
    model.addAttribute("account", new BankAccount());
    model.addAttribute("accounts", this.accounts);
  }
}
