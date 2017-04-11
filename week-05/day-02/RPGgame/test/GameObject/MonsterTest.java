package GameObject;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonsterTest {

  Monster MyMonster = new Monster();

  @Test
  public void createMonster() {
    assertNotNull(MyMonster);
  }

  @Test
  public void createMonster_name_Joe() {
    assertEquals("Joe", MyMonster.getName());
  }
}