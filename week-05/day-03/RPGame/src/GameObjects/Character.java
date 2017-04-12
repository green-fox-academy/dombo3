package GameObjects;

public class Character extends GameObject {

  public Character(int posX, int posY, String costume) {
    super(posX, posY, costume);
  }

  public void moveUp() {
    if ((getPosY() - 72) >= 0 && (GameMap.gameBoard[getPosY()/72 - 1][getPosX()/72] != 0)) {
      move(0, -72);
    }
  }
  public void moveDown() {
    if ((getPosY() + 72) < 720 && (GameMap.gameBoard[getPosY()/72 + 1][getPosX()/72] != 0)) {
      move(0, 72);
    }
  }
  public void moveRight() {
    if ((getPosX() + 72) < 720 && (GameMap.gameBoard[getPosY()/72][getPosX()/72 + 1] != 0)) {
      move(72, 0);
    }
  }
  public void moveLeft() {
    if ((getPosX() - 72) >= 0 && (GameMap.gameBoard[getPosY()/72][getPosX()/72 -1] != 0)) {
      move(-72, 0);
    }
  }
}