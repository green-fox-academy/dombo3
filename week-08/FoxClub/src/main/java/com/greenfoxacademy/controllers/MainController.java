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
    fox.addTrick("hop on corpes");
    return "index";
  }

  @RequestMapping("/nutrition")
  public String nutritionStore() {
    return "nutrition";
  }

  @PostMapping("/addFields")
  public String add(@RequestParam("food") String food, @RequestParam("drink") String drink) {
    fox.setFood(food);
    fox.setDrink(drink);
    return "index";
  }

  @ModelAttribute
  public void addAttributes(Model model) {
    model.addAttribute("fox", fox);
  }
}
