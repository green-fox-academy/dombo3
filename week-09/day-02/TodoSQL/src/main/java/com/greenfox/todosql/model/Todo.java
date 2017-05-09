package com.greenfox.todosql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int Id;
  private String title;
  private boolean isUrgent = false;
  private boolean isDone = false;

  public Todo() {}

  public Todo(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return title;
  }
}
