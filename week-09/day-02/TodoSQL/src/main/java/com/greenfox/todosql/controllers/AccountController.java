package com.greenfox.todosql.controllers;

import com.greenfox.todosql.model.Account;
import org.springframework.stereotype.Controller;

@Controller
public class AccountController {
  public static Account account;

  public static Account getAccount() {
    return account;
  }

  public static void setAccount(Account account) {
    AccountController.account = account;
  }
}
