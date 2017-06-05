package com.greenfox.controllers;

import com.greenfox.model.Food;
import com.greenfox.model.FoodList;
import com.greenfox.model.FoodService;
import com.greenfox.model.Foodtype;
import com.greenfox.model.Response;
import com.greenfox.model.Stat;
import com.greenfox.repository.FoodRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalorieRestController {

  FoodList foodList;
  FoodRepo foodRepo;
  Stat stat;
  FoodService foodService;

  @Autowired
  public CalorieRestController(FoodList foodList, FoodRepo foodRepo, Stat stat, FoodService foodService) {
    this.foodList = foodList;
    this.foodRepo = foodRepo;
    this.stat = stat;
    this.foodService = foodService;
  }

  @GetMapping("/getmeals")
  public FoodList getmeals() {
    foodList.setFoods(foodService.getMeals());
    return foodList;
  }

  @GetMapping("/getstats")
  public Stat getstats() {
    stat.setNumberOfMeals(foodService.getNumberOfMeals());
    stat.setTotalCalories(foodService.getTotalCalories());
    return stat;
  }

  @PostMapping("/meal")
  public Response addMeal(@RequestBody Food food) {
    foodRepo.save(food);
    return new Response("ok");
  }

  @PutMapping("/meal")
  public Response updateMeal(@RequestBody Food food) {
    Food updateMeal = foodRepo.findOne(food.getId());
    updateMeal.setDescription(food.getDescription());
    updateMeal.setType(food.getType());
    updateMeal.setCalories(food.getCalories());
    updateMeal.setDate(food.getDate());
    foodRepo.save(updateMeal);
    return new Response("ok");
  }

  @DeleteMapping("/meal")
  public Response deleteMeal(@RequestBody Food food) {
    foodRepo.delete(food.getId());
    return new Response("ok");
  }
}
