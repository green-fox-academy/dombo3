package com.example.greenfoxacademy.model;

public class CargoStatus {

  private String received;
  private int amount;
  private String shipstatus;
  private boolean ready;

  public CargoStatus(String received, int amount, String shipstatus, boolean ready) {
    this.received = received;
    this.amount = amount;
    this.shipstatus = shipstatus;
    this.ready = ready;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public String getReceived() {
    return received;
  }

  public int getAmount() {
    return amount;
  }

  public boolean isReady() {
    return ready;
  }
}
