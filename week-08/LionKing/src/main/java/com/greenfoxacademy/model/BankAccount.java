package com.greenfoxacademy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BankAccount {
  private String name;
  private float balance;
  private String animalType;
}
