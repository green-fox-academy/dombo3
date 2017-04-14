package GameObjects;

public class Skeleton extends Monster {
  public Skeleton(String costume, GameMap map) {
    super(costume, map);
  }

  public void move() {
    super.moveDown();
  }
}