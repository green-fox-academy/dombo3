import GameObjects.Floor;
import GameObjects.GameObject;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import GameObjects.*;

public class GameMapTest {

  GameMap gameMap = new GameMap();
  GameObject floor = new Floor(72,72,"assert/floor.png");

  @Test
  public void fillMap_getCostumeFirstObject_isFloor() throws Exception {
    gameMap.fillMap();
    GameObject firstObject = gameMap.getGameObjects().get(0);
    assertEquals(floor.getClass(),firstObject.getClass());
  }
}