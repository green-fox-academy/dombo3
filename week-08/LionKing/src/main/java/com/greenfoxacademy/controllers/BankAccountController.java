package com.greenfoxacademy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BankAccountController {

  @RequestMapping("/exercise1")
  public String bankAccount() {
    return "exercise1";
  }
}
