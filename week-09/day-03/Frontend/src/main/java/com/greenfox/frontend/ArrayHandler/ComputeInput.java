package com.greenfox.frontend.ArrayHandler;

import java.util.ArrayList;
import java.util.List;

public class ComputeInput {
  private String what;
  private List<Integer> numbers;

  public ComputeInput() {
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

  public int sum() {
    int result = 0;
    for (int num : numbers) {
      result += num;
    }
    return result;
  }

  public int multiply() {
    int result = 1;
    for (int num : numbers) {
      result *= num;
    }
    return result;
  }

  public List<Integer> doubleNumbers() {
    List<Integer> result = new ArrayList<>();
    for (int num : numbers) {
      result.add(num * 2);
    }
    return result;
  }
}
