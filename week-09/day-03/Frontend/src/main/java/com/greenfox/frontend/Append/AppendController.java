package com.greenfox.frontend.Append;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appenda")
public class AppendController {

  @GetMapping("/{appendable}")
  public Append append(@PathVariable("appendable") String appendable) {
    return new Append(appendable + "a");
  }
}
