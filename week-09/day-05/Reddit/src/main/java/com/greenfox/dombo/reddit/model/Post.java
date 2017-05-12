package com.greenfox.dombo.reddit.model;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String title;
  private String href;
  public Timestamp timestamp;
  private int score = 0;

  public Post() {
    this.timestamp = new Timestamp(System.currentTimeMillis());
    System.out.println("in empty constructor");
  }

  public Post(String title, String href) {
    this.timestamp = new Timestamp(System.currentTimeMillis());
    this.title = title;
    this.href = href;
    System.out.println("in two arg constructor");
  }

  public Post(String title, String href, int score) {
    this.title = title;
    this.href = href;
    this.timestamp = new Timestamp(System.currentTimeMillis());
    this.score = score;
    System.out.println("in full arg contructor");
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public Timestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Timestamp timestamp) {
    this.timestamp = timestamp;
  }

  public void upvote() {
    this.score += 1;
  }

  public void downvote() {
    this.score -= 1;
  }
}
