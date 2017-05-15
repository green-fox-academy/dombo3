package com.example.greenfoxacademy.controllers;

import com.example.greenfoxacademy.ExceptionMessage;
import com.example.greenfoxacademy.model.Message;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public Message getMessage(@RequestParam String input) {
    Message message = new Message(input);
    return message;
  }

  @ExceptionHandler(Exception.class)
  public ExceptionMessage GuradianException() {
    return new ExceptionMessage("I am Groot!");
  }
}
