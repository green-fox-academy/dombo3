package GameObjects;

import org.junit.Test;

import static org.junit.Assert.*;
public class BossTest {
  GameMap gameMap = new GameMap();
  Boss boss = new Boss("assert/boss.png", gameMap);

  @Test
  public void createBoss() throws Exception {
   assertEquals(10,boss.HP);
  }
}