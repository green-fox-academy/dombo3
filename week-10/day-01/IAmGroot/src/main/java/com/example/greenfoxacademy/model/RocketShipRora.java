package com.example.greenfoxacademy.model;

import com.example.greenfoxacademy.exception.OverLoadRocketException;
import org.springframework.stereotype.Component;

@Component
public class RocketShipRora {
  private int caliber25;
  private int caliber30;
  private int caliber50;
  private String shipstatus = "empty";
  private boolean ready = false;

  public RocketShipRora() {
    this.caliber25 = 0;
    this.caliber30 = 0;
    this.caliber50 = 0;
  }

  public CargoStatus getStatus(String received, int amount) {
    CargoStatus cargoStatus = new CargoStatus(received, amount, shipstatus, ready);
    return cargoStatus;
  }

  public void setShipStatus() {
    double status = (double) getAmount() / 12500;
    status *= 100;
    if (status == 0) {
      shipstatus = "empty";
    } else if (status < 100) {
      shipstatus = Double.toString(status) + "%";
    } else {
      shipstatus = "full";
    }
  }

  public void fillCaliber(String caliber, int amount) throws Exception {
      if (getAmount() + amount > 12500) {
        throw new OverLoadRocketException();
      } else if (getAmount() == 12500) {
        setReady(true);
      } else {
        switch(caliber) {
          case ".50": setCaliber50(getCaliber50()+amount);
          break;
          case ".25": setCaliber25(getCaliber25()+amount);
          break;
          case ".30": setCaliber30(getCaliber30()+amount);
        }
      }
    setShipStatus();
  }

  public int getAmount() {
    return caliber25 + caliber30 + caliber50;
  }

  public int getCaliber25() {
    return caliber25;
  }

  public void setCaliber25(int caliber25) {
    this.caliber25 = caliber25;
  }

  public int getCaliber30() {
    return caliber30;
  }

  public void setCaliber30(int caliber30) {
    this.caliber30 = caliber30;
  }

  public int getCaliber50() {
    return caliber50;
  }

  public void setCaliber50(int caliber50) {
    this.caliber50 = caliber50;
  }

  public String getShipstatus() {
    return shipstatus;
  }

  public boolean isReady() {
    return ready;
  }

  public void setShipstatus(String shipstatus) {
    this.shipstatus = shipstatus;
  }

  public void setReady(boolean ready) {
    this.ready = ready;
  }
}
