package com.greenfoxacademy.controllers;

import com.greenfoxacademy.model.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankAccountController {

  List<BankAccount> accounts = new ArrayList<>();

  @PostMapping("/addBankAccount")
  public String submit(@ModelAttribute("newAccount") BankAccount newAccount, Model model) {
    model.addAttribute("name", newAccount.getName());
    model.addAttribute("balance", newAccount.getBalance());
    model.addAttribute("animalType", newAccount.getAnimalType());

    accounts.add(newAccount);
    return "bankAccountView";
  }

  @GetMapping("/addBankAccount")
  public String view() {
    return "bankAccountView";
  }

  @PostMapping("/click")
  public String setZebra(@ModelAttribute("account") BankAccount account) {
    for (int i = 0; i < accounts.size(); i++) {
      accounts.get(i).setZebras(10);
      System.out.println(accounts.get(i).getName());
      System.out.println(accounts.get(i).getZebras());
    }
    System.out.println(account.getName());
    System.out.println(account.getZebras());
    return "bankAccountView";
  }

  @PostMapping("/click2")
  public String submitZebra(@ModelAttribute("newAccount") BankAccount newAccount) {
    newAccount.setZebras(10);
    return "bankAccountView";
  }

  @ModelAttribute
  public void addAttributes(Model model) {
    model.addAttribute("newAccount", new BankAccount());
    model.addAttribute("accounts", this.accounts);
  }
}
