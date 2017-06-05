package com.greenfox.controllers;

import com.greenfox.model.Food;
import com.greenfox.model.FoodService;
import com.greenfox.model.Foodtype;
import com.greenfox.repository.FoodRepo;
import com.greenfox.repository.FoodtypeRepo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalorieController {

  FoodService foodService;
  FoodtypeRepo foodtypeRepo;
  FoodRepo foodRepo;

  @Autowired
  public CalorieController(FoodtypeRepo foodtypeRepo, FoodRepo foodRepo, FoodService foodService) {
    this.foodtypeRepo = foodtypeRepo;
    this.foodRepo = foodRepo;
    this.foodService = foodService;
  }

  @ModelAttribute
  public void add(Model model) {
    model.addAttribute("foodtypes",foodService.getFoodTypes());
  }

  @RequestMapping("/")
  public String main(Model model) {
    Iterable foods = foodRepo.findAll();
    model.addAttribute("numberOfFoods",foodService.getNumberOfMeals());
    model.addAttribute("totalCalories", foodService.getTotalCalories());
    model.addAttribute("foods", foods);
    return "index";
  }

  @PostMapping("/edit")
  public String edit(Model model, @RequestParam("index") Long id) {
    model.addAttribute("editfood", foodRepo.findOne(id));
    return "edit";
  }

  @GetMapping("/edit")
  public String edit(Model model) {
    model.addAttribute("foods", foodRepo.findAll());
    return "edit";
  }

  @PostMapping("/add")
  public String add() {
    return "edit";
  }

  @PostMapping("/save")
  public String change(@RequestParam(value = "index", required = false) String id, @RequestParam("date") String date, @RequestParam("type") String type, @RequestParam("description") String description, @RequestParam("calories") int calories) throws Exception {
    Food food;
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date newdate = format.parse(date);

    if (id.equals("null")) {
      food = new Food(newdate,type,description,calories);
    } else {
      food = foodRepo.findOne(Long.parseLong(id));
      food.setDate(newdate);
      food.setType(type);
      food.setDescription(description);
      food.setCalories(calories);
    }

    foodRepo.save(food);
    return "redirect:/";
  }

  @PostMapping("/delete")
  public String delete(@RequestParam("index") Long id) {
    foodRepo.delete(id);
    return "redirect:/";
  }
}
