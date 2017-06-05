package com.greenfox.model;

import org.springframework.stereotype.Component;

@Component
public class Stat {
  private int numberOfMeals;
  private int totalCalories;

  public int getNumberOfMeals() {
    return numberOfMeals;
  }

  public int getTotalCalories() {
    return totalCalories;
  }

  public void setNumberOfMeals(int numberOfMeals) {
    this.numberOfMeals = numberOfMeals;
  }

  public void setTotalCalories(int totalCalories) {
    this.totalCalories = totalCalories;
  }
}
