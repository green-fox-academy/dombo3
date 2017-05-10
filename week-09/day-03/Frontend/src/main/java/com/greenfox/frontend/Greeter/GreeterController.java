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
  public Greet greet(@RequestParam("name") String name,@RequestParam("student") String student) {
    return new Greet("Oh, hi there " + name + ", my dear " + student + "!");
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public GreetErrorMessage GreetError(MissingServletRequestParameterException ex) {
    GreetErrorMessage error = null;
    if (ex.getParameterName().equals("name")) {
       error = new GreetErrorMessage("Please provide a name!");
    } else if (ex.getParameterName().equals("student")) {
      error = new GreetErrorMessage("Please provide a student!");
    }
    return error;
  }

}
