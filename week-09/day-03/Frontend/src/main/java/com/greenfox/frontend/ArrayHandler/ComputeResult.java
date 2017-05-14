package com.greenfox.frontend.ArrayHandler;

import org.springframework.stereotype.Component;

@Component
public class ComputeResult {
  public Object result;

  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }
}
