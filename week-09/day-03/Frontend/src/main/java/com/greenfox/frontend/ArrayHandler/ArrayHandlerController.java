package com.greenfox.frontend.ArrayHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayHandlerController {

  @Autowired
  ComputeResult computeResult;

  @PostMapping("/arrays")
  public ComputeResult result(@RequestBody ComputeInput computeInput) {
    if(computeInput.getWhat().equals("sum")) {
      computeResult.setResult(computeInput.sum());
    } else if (computeInput.getWhat().equals("multiply")) {
      computeResult.setResult(computeInput.multiply());
    } else if (computeInput.getWhat().equals("double")) {
      computeResult.setResult(computeInput.doubleNumbers());
    }
    return computeResult;
  }

  @ExceptionHandler(NullPointerException.class)
  public ArrayHandlerErrorMessage ArrayHandlerError() {
    return new ArrayHandlerErrorMessage("Please provide what to do with the numbers!");
  }
}
