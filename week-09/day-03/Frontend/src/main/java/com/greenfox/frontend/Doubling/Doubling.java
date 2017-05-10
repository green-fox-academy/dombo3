package com.greenfox.frontend.Doubling;

import org.springframework.stereotype.Component;

public class Doubling {
  private int recieved;
  private int result;

  public Doubling(int recieved) {
    this.recieved = recieved;
  }

  public int doubling(int recieved) {
    return recieved * 2;
  }


  public int getRecieved() {
    return recieved;
  }

  public void setRecieved(int recieved) {
    this.recieved = recieved;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
