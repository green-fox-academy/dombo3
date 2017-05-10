package com.greenfox.frontend.DoUntil;

public class DoUntil {

  private int result;

  public void sum(int until) {
    for (int i = until; i > 0; i--) {
      result += i;
    }
  }

  public void factorial(int until) {
    result = 1;
    for (int i = 1; i <= until; i++) {
      result *= i;
    }
  }

  public DoUntil() {
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
