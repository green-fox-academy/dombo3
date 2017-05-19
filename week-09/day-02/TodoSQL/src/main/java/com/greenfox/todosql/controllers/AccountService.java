package com.greenfox.todosql.controllers;

import com.greenfox.todosql.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
  private Account account;

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }
}
