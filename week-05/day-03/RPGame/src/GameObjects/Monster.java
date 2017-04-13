package GameObjects;

public class Monster extends Character {
  public Monster() {
  }

  public Monster(String costume, GameMap map) {
    super(map.getRandomCoordinate()[0],map.getRandomCoordinate()[1],costume, map);
  }
}