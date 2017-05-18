package com.greenfox.todosql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Todo {

  @ManyToOne
  @JoinColumn(name = "accountid")
  private Account account;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long Id;

  private String title;
  private boolean isUrgent = false;
  private boolean isDone = false;

  public Todo() {}

  public Todo(Account account, String title, boolean isUrgent, boolean isDone) {
    this.account = account;
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public long getId() {
    return Id;
  }

  public void setId(long id) {
    Id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean done) {
    isDone = done;
  }

  @Override
  public String toString() {
    return title;
  }

}
