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
  private boolean king;
  private boolean goodGuy;
  private int zebras;

  public BankAccount(String name, float balance, String animalType) {
    this.king = false;
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.goodGuy = true;
    this.zebras = 0;
  }
}
