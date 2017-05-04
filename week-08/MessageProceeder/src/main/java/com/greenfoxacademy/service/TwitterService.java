package com.greenfoxacademy.service;

public class TwitterService implements MessageService {
  @Override
  public String send(String message, String email) {
    return message + ", " + email;
  }
}
