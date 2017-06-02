package com.greenfox.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Date date;
  private String type;
  private String description;
  private int calories;

  public Date getDate() {
    return date;
  }

  public String getType() {
    return type;
  }

  public String getDescription() {
    return description;
  }

  public int getCalories() {
    return calories;
  }
}
