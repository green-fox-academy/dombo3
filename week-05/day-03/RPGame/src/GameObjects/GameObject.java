package GameObjects;

public class GameObject {
  private int posX;
  private int posY;
  private String costume;

  public GameObject() {

  }

  public GameObject(int posX, int posY, String costume) {
    this.posX = posX;
    this.posY = posY;
    this.costume = costume;
  }

  public void move() {
//    this.PosX = getCharPosX();
//    this.PosY = getCharPosY();
  }

  public int getPosX() {
    return posX;
  }

  public int getPosY() {
    return posY;
  }

  public String getCostume() {
    return costume;
  }
}
