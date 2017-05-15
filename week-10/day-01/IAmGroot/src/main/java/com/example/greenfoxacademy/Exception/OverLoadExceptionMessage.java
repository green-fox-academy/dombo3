package com.example.greenfoxacademy.Exception;

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
