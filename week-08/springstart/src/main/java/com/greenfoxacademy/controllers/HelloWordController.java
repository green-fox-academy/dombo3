package com.greenfoxacademy.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWordController {
  @RequestMapping(value = "/hello")
  @ResponseBody
  public String hello() {
    return "Hello World";
  }
}
