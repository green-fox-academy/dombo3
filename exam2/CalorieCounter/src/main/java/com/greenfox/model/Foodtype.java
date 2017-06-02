package com.greenfox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Foodtype {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long Id;
  private String type;

  public long getId() {
    return Id;
  }

  public String getType() {
    return type;
  }
}
