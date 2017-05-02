package com.greenfoxacademy.controllers;

import com.greenfoxacademy.Greeting;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  AtomicLong id = new AtomicLong();

  @RequestMapping(value = "/greeting")
  public Greeting greeting(@RequestParam(value = "name", defaultValue = "Hello World", required = false) String name) {
    Greeting greet = new Greeting(id.incrementAndGet(), "Hello " + name);
    return greet;
  }
}
