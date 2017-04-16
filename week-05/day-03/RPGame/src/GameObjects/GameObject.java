package GameObjects;

import java.util.ArrayList;
import java.util.List;

public abstract class GameObject {
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

  public void move(int x, int y) {
    this.posX = posX+x;
    this.posY = posY+y;
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

  public void setCostume(String costume) {
    this.costume = costume;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }
}