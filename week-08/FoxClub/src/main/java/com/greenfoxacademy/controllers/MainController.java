package com.greenfoxacademy.controllers;

import com.greenfoxacademy.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  @Autowired
  Fox fox;

  @RequestMapping("/")
  public String getIndex(){
    fox.setDrink("lemonade");
    fox.setFood("pizza");
    fox.setName("Mr.Fox");
    return "index";
  }

  @RequestMapping("/nutritionStore")
  public String nutritionStore() {
    return "nutritionStore";
  }

  @RequestMapping("/trickCenter")
  public String trickCenter() {
    return "trickCenter";
  }

  @PostMapping("/addFields")
  public String addFields(@RequestParam("food") String food, @RequestParam("drink") String drink) {
    fox.setFood(food);
    fox.setDrink(drink);
    return "index";
  }

  @PostMapping("/addTrick")
  public String addTrick() {
    return "index";
  }

  @ModelAttribute
  public void addAttributes(Model model) {
    model.addAttribute("fox", fox);
  }
}
