import GameObjects.Floor;
import GameObjects.GameObject;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import GameObjects.*;

public class GameMapTest {

  GameMap gameMap = new GameMap();
  GameObject floor = new Floor(72,72,"assert/floor.png");
  GameObject wall = new Wall(72,72, "assert/wall.png");

  @Test
  public void fillMap() throws Exception {
    gameMap.fillMap();
    List<List<GameObject>> myList = gameMap.getGameObjects();
    GameObject firstObject = myList.get(0).get(0);
    assertEquals(floor.getClass(),firstObject.getClass());
  }

  @Test
  public void fillMap_getCostume() throws Exception {
    gameMap.fillMap();
    List<List<GameObject>> myList = gameMap.getGameObjects();
    GameObject firstObject = myList.get(0).get(0);
    assertEquals(floor.getClass(),firstObject.getClass());
  }

}