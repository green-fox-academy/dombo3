package com.greenfoxacademy.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

  AtomicLong id = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name", defaultValue = "World", required = false) String name) {
    model.addAttribute("name", name);
    model.addAttribute("counter", id.incrementAndGet());
    return "greeting";
  }
}
