package com.example.greenfoxacademy.model;

public class YundusArrow {
  private float distance;
  private float time;
  private float speed;

  public YundusArrow(float distance, float time) {
    this.distance = distance;
    this.time = time;
  }

  public void calculateSpeed() {
    setSpeed(distance/time);
  }

  public float getDistance() {
    return distance;
  }

  public void setDistance(float distance) {
    this.distance = distance;
  }

  public float getTime() {
    return time;
  }

  public void setTime(float time) {
    this.time = time;
  }

  public float getSpeed() {
    return speed;
  }

  public void setSpeed(float speed) {
    this.speed = speed;
  }
}
