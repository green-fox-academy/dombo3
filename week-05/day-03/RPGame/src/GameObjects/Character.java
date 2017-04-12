package GameObjects;

public class Character extends GameObject {

  public Character() {
    super();
  }

  public void moveUp() {
    if (getPosX() - 72) >= 0 && (gameBoard[HeroY/72 - 1][HeroX/72] != 0) {

    }
  }

  public void moveDown() {

  }

  public void moveRight() {

  }

  public void moveLeft() {

  }
}
