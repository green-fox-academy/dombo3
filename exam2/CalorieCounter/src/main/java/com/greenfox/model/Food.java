package com.greenfox.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

  public Food() {
  }

  public Food(Date date, String type, String description, int calories) {
    this.date = date;
    this.type = type;
    this.description = description;
    this.calories = calories;
  }

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

  public Long getId() {
    return id;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }
}
