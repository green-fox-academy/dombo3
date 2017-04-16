package GameObjects;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public abstract class Character extends GameObject {

  private List<GameObject> characterList;
  private GameMap map;

  protected int maxHP;
  protected int HP;
  protected int DP;
  protected int SP;

  public Character() {
  }

  public Character(String costume, GameMap map) {
    super(0,0,costume);
    this.characterList = new ArrayList<>();
    this.map = map;
  }

  public void moveUp() {
    if ((getPosY() - map.TILESIZE) >= 0 && (GameMap.gameBoard[getPosY()/map.TILESIZE - 1][getPosX()/map.TILESIZE] != 0)) {
      move(0, -map.TILESIZE);
    }
  }

  public void moveDown() {
    if ((getPosY() + map.TILESIZE) < map.row * map.TILESIZE && (GameMap.gameBoard[getPosY()/map.TILESIZE + 1][getPosX()/map.TILESIZE] != 0)) {
      move(0, map.TILESIZE);
    }
  }

  public void moveRight() {
    if ((getPosX() + map.TILESIZE) < map.col * map.TILESIZE  && (GameMap.gameBoard[getPosY() /map.TILESIZE][getPosX() /map.TILESIZE + 1] != 0)) {
      move(map.TILESIZE, 0);
    }
  }

  public void moveLeft() {
    if ((getPosX() - map.TILESIZE) >= 0 && (GameMap.gameBoard[getPosY()/map.TILESIZE][getPosX()/map.TILESIZE -1] != 0)) {
      move(-map.TILESIZE, 0);
    }
  }
}