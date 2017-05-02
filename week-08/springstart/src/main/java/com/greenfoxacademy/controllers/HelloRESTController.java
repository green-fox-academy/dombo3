package com.greenfoxacademy.controllers;

import com.greenfoxacademy.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping(value = "/")
  public Greeting greeting() {
    Greeting greet = new Greeting(1, "Hello" + name);
    return greet;
  }
}
