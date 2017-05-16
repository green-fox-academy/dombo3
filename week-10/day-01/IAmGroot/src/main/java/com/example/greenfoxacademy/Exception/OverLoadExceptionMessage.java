package com.example.greenfoxacademy.exception;

public class OverLoadExceptionMessage {
    private String error;

    public OverLoadExceptionMessage(String error) {
      this.error = error;
    }

    public String getError() {
      return error;
    }

    public void setError(String error) {
      this.error = error;
    }
}
