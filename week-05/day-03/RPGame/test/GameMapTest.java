import GameObjects.Floor;
import GameObjects.GameObject;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import GameObjects.*;

public class GameMapTest {

  GameMap gameMap = new GameMap();
  GameObject floor = new Floor(72,72,"assert/floor.png");

  @Before
  public void setup() throws Exception {
    gameMap.fillMap();
  }

  @Test
  public void fillMap_getCostumeFirstObject_isFloor() throws Exception {
    GameObject firstObject = gameMap.getGameObjects().get(0);
    assertEquals(floor.getClass(),firstObject.getClass());
  }

  @Test
  public void generateRandomNum() throws Exception {
    int[] position = gameMap.getRandomCoordinate();
    assertEquals(0,position[0]);
  }

  @Test
  public void isWall() throws Exception {
    boolean isWall = gameMap.isWall(0,3);
    assertTrue(isWall);
  }
}