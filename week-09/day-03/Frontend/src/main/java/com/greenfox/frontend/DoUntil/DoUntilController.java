package com.greenfox.frontend.DoUntil;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dountil")
public class DoUntilController {

  @PostMapping("/{what}")
  public DoUntil calculate(@PathVariable("what") String what, @RequestBody InputJSON inputJSON) {
    DoUntil dountil = null;
    if (what.equals("sum")) {
     dountil = new DoUntil();
     dountil.sum(inputJSON.getUntil());
    } else if (what.equals("factorial")) {
      dountil = new DoUntil();
      dountil.factorial(inputJSON.getUntil());
    }
    return dountil;
  }

  @ExceptionHandler(Exception.class)
  public DoUntilErrorMessage doUntilErrorMessage() {
    return new DoUntilErrorMessage("Please provide a number!");
  }
}
