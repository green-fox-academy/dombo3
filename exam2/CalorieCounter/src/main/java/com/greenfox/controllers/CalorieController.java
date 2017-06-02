package com.greenfox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalorieController {

  @RequestMapping("/")
  public String main() {
    return "index";
  }
}
