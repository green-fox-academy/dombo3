package com.greenfox.todosql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long Id;
  private String title;
  private boolean isUrgent = false;
  private boolean isDone = false;

  public Todo() {}

  public Todo(String title, boolean isUrgent, boolean isDone) {
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
  }

  @Override
  public String toString() {
    return title;
  }
}
