package GameObjects;

public class Monster extends Character {
  public Monster() {
  }

  public Monster(String costume, GameMap map) {
    super(0,0,costume, map);
    int[] coordinate = map.getRandomCoordinate();
    this.setPosY(coordinate[0]);
    this.setPosX(coordinate[1]);
  }
}