package com.example.greenfoxacademy.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CargoStatusTest {

  RocketShipRora rocketShipRora = new RocketShipRora();

  @Test
  public void CreateCargoStatus_getShipStatus() throws Exception {
    rocketShipRora.fillCaliber(".50",5000);
    assertEquals("40.0%", rocketShipRora.getStatus(".50",5000).getShipstatus());
  }

  @Test
  public void CreateCargoStatus_getReceived() throws Exception {
    rocketShipRora.fillCaliber(".50",5000);
    assertEquals(".50", rocketShipRora.getStatus(".50",5000).getReceived());
  }

  @Test
  public void CreateCargoStatus_getAmount() throws Exception {
    rocketShipRora.fillCaliber(".50",5000);
    assertEquals(5000, rocketShipRora.getStatus(".50",5000).getAmount());
  }

  @Test
  public void CreateCargoStatus_isReady() throws Exception {
    rocketShipRora.fillCaliber(".50",5000);
    assertEquals(false, rocketShipRora.getStatus(".50",5000).isReady());
  }
}