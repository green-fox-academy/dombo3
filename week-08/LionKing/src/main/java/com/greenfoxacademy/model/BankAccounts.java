package com.greenfoxacademy.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class BankAccounts {
  List<BankAccount> accounts;

  public BankAccounts() {
    this.accounts = new ArrayList<>();
    accounts.add(new BankAccount("Nala",1000, "lion"));
    accounts.add(new BankAccount("Zordon",500, "lion"));
    accounts.add(new BankAccount("Mufasa",200, "lion"));
    accounts.add(new BankAccount("Timon",900, "suricata"));
    accounts.add(new BankAccount("Pumba",2,"warthog"));
  }
}
