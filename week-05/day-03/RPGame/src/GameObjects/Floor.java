package GameObjects;

public class Floor extends Tile {

  public Floor() {
  }

  public Floor(int posX, int posY, String costume) {
    super(posX, posY, costume);
  }

  public boolean isClear() {
    return false;
  }

}
