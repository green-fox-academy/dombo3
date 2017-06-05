package com.greenfox.model;

import com.greenfox.repository.FoodRepo;
import com.greenfox.repository.FoodtypeRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
  FoodList foodList;
  FoodRepo foodRepo;
  Stat stat;
  FoodtypeRepo foodtypeRepo;

  @Autowired
  public FoodService(FoodList foodList, FoodRepo foodRepo, Stat stat, FoodtypeRepo foodtypeRepo) {
    this.foodList = foodList;
    this.foodRepo = foodRepo;
    this.stat = stat;
    this.foodtypeRepo = foodtypeRepo;
  }

  public List<Food> getMeals() {
    List<Food> meals = new ArrayList<>();
    Iterable foods = foodRepo.findAll();
    for (Object food : foods) {
      meals.add(((Food) food));
    }
    return meals;
  }

  public List<String> getFoodTypes() {
    List<String> type = new ArrayList<>();
    Iterable foodtype = foodtypeRepo.findAll();
    for (Object food : foodtype) {
      type.add(((Foodtype) food).getType());
    }
    return type;
  }

  public int getNumberOfMeals() {
    Iterable foods = foodRepo.findAll();
    int numberOfFoods = 0;
    for (Object food : foods) {
      numberOfFoods++;
    }
    return numberOfFoods;
  }

  public int getTotalCalories() {
    Iterable foods = foodRepo.findAll();
    int totalCalories = 0;
    for (Object food : foods) {
      totalCalories += ((Food) food).getCalories();
    }
    return totalCalories;
  }
}
