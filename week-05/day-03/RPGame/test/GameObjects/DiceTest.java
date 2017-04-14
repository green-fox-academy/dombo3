package GameObjects;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {
  Dice myDice = new Dice();

  @Test
  public void roll() throws Exception {
  assertEquals(1,myDice.roll());
  }
}