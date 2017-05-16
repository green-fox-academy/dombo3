package com.example.greenfoxacademy.model;

public class DraxFood {
  private String name;
  private double amount;
  private double calorie;

  public DraxFood(String name, double amount, double calorie) {
    this.name = name;
    this.amount = amount;
    this.calorie = calorie;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public double getCalorie() {
    return calorie;
  }

  public void setCalorie(double calorie) {
    this.calorie = calorie;
  }
}
