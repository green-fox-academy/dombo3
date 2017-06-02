package com.greenfox.controllers;

import com.greenfox.model.Foodtype;
import com.greenfox.repository.FoodRepo;
import com.greenfox.repository.FoodtypeRepo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalorieController {

  FoodtypeRepo foodtypeRepo;
  FoodRepo foodRepo;

  @Autowired
  public CalorieController(FoodtypeRepo foodtypeRepo, FoodRepo foodRepo) {
    this.foodtypeRepo = foodtypeRepo;
    this.foodRepo = foodRepo;
  }

  @ModelAttribute
  public void add(Model model) {
    List<String> type = new ArrayList<>();
    Iterable foodtype = foodtypeRepo.findAll();
    for (Object food : foodtype) {
      type.add(((Foodtype) food).getType());
    }
    model.addAttribute("foodtypes",type);
  }

  @RequestMapping("/")
  public String main(Model model) {
    model.addAttribute("foods", foodRepo.findAll());
    return "index";
  }

  @GetMapping("/edit")
  public String edit() {
    return "edit";
  }

  @PostMapping("/add")
  public String add() {

    return "index";
  }

}
