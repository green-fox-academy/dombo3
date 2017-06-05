package com.greenfox.model;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class FoodList {
  private List<Food> foods;


  public List<Food> getFoods() {
    return foods;
  }

  public void setFoods(List<Food> foods) {
    this.foods = foods;
  }
}
