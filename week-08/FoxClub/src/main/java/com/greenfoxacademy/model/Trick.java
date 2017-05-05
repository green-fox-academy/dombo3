package com.greenfoxacademy.model;

import java.util.Arrays;
import java.util.List;
import lombok.Getter;

@Getter
public enum Trick {
  JUMP(0,"jump"), EAT(1,"eat");

  private String name;
  public int ID;
  public static List<Trick> trickList = Arrays.asList(Trick.values());

Trick(int ID, String name) {
  this.name = name;
  this.ID = ID;
}

public void createUnkownList(Fox fox) {
  for (Trick trick : trickList) {
    for (String knownTrick : fox.getTricklist())
    if (trick.getName() != knownTrick) {
      fox.getUnkownList().add(trick.getName());
    }
  }
}
}
