package com.greenfoxacademy.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter
@Setter
public class BankAccount {
  private String name;
  private float balance;
  private String animalType;
  private boolean king = false;
  private boolean goodGuy = true;
  private int zebras = 0;

  public BankAccount(String name, float balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }
}
