package com.greenfoxacademy;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Greeting {
  private long Id;
  private String content;
  private String color;
  private int size;

  public Greeting(long id, String content) {
    Id = id;
    this.content = content;
  }
}
