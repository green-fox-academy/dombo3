package GameObjects;

import java.util.ArrayList;
import java.util.List;

public class Character extends GameObject {

  private List<GameObject> characterList;
  private GameMap map;

  public Character() {
  }

  public Character(int posX, int posY, String costume, GameMap map) {
    super(posX, posY, costume);
    this.characterList = new ArrayList<>();
    this.map = map;
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

  public List<GameObject> getCharacterList() {
    return characterList;
  }
}