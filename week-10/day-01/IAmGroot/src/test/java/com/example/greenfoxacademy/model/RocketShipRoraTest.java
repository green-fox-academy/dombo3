package com.example.greenfoxacademy.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class RocketShipRoraTest {

  RocketShipRora rocketShipRora = new RocketShipRora();

  @Test
  public void emptyShipStatus() {
    assertEquals("empty", rocketShipRora.getShipstatus());
  }

  @Test
  public void emptyShipCaliber50Amount() {
    assertEquals(0,rocketShipRora.getCaliber50());
  }

  @Test
  public void fillShip() throws Exception {
    rocketShipRora.fillCaliber(".50", 5000);
    assertEquals(5000, rocketShipRora.getCaliber50());
  }

  @Test
  public void getAmount() throws Exception {
    rocketShipRora.fillCaliber(".50",5000);
    assertEquals(5000,rocketShipRora.getAmount());
  }

  @Test
  public void getAmountMultipleFill() throws Exception {
    rocketShipRora.fillCaliber(".50",5000);
    rocketShipRora.fillCaliber(".25", 2000);
    assertEquals(7000,rocketShipRora.getAmount());
  }

  @Test
  public void setShipStatus() throws Exception {
    rocketShipRora.fillCaliber(".50",5000);
    rocketShipRora.setShipStatus();
    assertEquals("40.0%", rocketShipRora.getShipstatus());
  }
}