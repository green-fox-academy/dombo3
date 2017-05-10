package com.greenfox.frontend.Doubling;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

  @GetMapping("/doubling")
  public Doubling doubling(@RequestParam(value = "input") int input) {
    Doubling doublingobj = new Doubling(input);
    doublingobj.setResult(doublingobj.doubling(input));
    return doublingobj;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public DoublingErrorMessage DoublingError() {
    return new DoublingErrorMessage("Please provide an input!");
  }
}
