package com.greenfox.frontend.Greeter;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  @GetMapping("/greeter")
  public Greet greet(@RequestParam("name") String name,@RequestParam("title") String title) {
    return new Greet("Oh, hi there " + name + ", my dear " + title + "!");
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public GreetErrorMessage GreetError(MissingServletRequestParameterException ex) {
    return new GreetErrorMessage("Please provide a " + ex.getParameterName() + "!");
  }

}
