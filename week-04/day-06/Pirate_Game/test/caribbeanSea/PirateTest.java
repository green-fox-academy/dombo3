package caribbeanSea;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PirateTest {

  Pirate myPirate = new Pirate();

  @Test
  public void testPirateConstructor_rumLevel() {
    assertEquals(0, myPirate.getRumLevel());
  }

  @Test
  public void testPirateConstructor_alive() {
    assertEquals(true, myPirate.isAlive());
  }


  @Test
  public void drinkSomeRum() throws Exception {
    myPirate.drinkSomeRum();
    int rumLevel = myPirate.getRumLevel();
    assertEquals(1,rumLevel);
  }

  @Test
  public void howItGoingMate_rumLevelIs4_rumLevelIs4() throws Exception {
    myPirate.setRumLevel(4);
    myPirate.howItGoingMate();
    assertEquals(4,myPirate.getRumLevel());
  }

  @Test
  public void howItGoingMate_rumLevelIs0_rumLevelIs5() throws Exception {
    myPirate.setRumLevel(5);
    myPirate.howItGoingMate();
    assertEquals(0,myPirate.getRumLevel());
  }

  @Test
  public void die_setIsAliveFalse() throws Exception {
    myPirate.die();
    assertEquals(false, myPirate.isAlive());
  }

  @Test
  public void brawl() throws Exception {

  }

  @Test
  public void addParrot() throws Exception {

  }
}