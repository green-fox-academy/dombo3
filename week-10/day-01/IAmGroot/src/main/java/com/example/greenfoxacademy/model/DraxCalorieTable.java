package com.example.greenfoxacademy.model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class DraxCalorieTable {
  private List<DraxFood> foods;

  public DraxCalorieTable() {
    this.foods = new ArrayList<>();
  }

  public void add(DraxFood draxFood) {
    foods.add(draxFood);
  }

  public List<DraxFood> getFoods() {
    return foods;
  }

  public void setDraxFoodList(List<DraxFood> draxFoodList) {
    this.foods = draxFoodList;
  }
}
