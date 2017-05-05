package com.greenfoxacademy.model;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class BankAccount {
  private String name;
  private float balance;
  private String animalType;
  private boolean king;
  private boolean goodGuy;
  private int zebras;
  private static int count;
  public int ID;

  public BankAccount(String name, float balance, String animalType) {
    this.king = false;
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.goodGuy = true;
    this.zebras = 0;
  }

  public BankAccount() {
    this.ID = count;
    count++;
  }

  public void addZebra() {
    zebras+= 10;
  }
}
