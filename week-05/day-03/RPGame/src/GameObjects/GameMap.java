package GameObjects;

import java.util.ArrayList;
import java.util.List;

public class GameMap {
  public static int[][] gameBoard = new int[][]{
          {1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
          {1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1},
          {1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1},
          {1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1},
          {0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
          {1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0, 0},
          {1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1},
          {1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1},
          {1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
  };

  private List<GameObject> gameFloor;
  public int gameLevel = 0;
  protected int row = gameBoard.length;
  protected int col = gameBoard[0].length;
  protected final int TILESIZE = 72;

  public GameMap() {
    this.gameFloor = new ArrayList<>();
    gameLevel += 1;
  }

  public void fillMap() {
    for (int i = 0; i < col; i++) {
      for (int j = 0; j < row; j++) {
        if (gameBoard[j][i] == 1) {
          gameFloor.add(new Floor(i * TILESIZE, j * TILESIZE, "assets/floor.png"));
        } else if (gameBoard[j][i] == 0) {
          gameFloor.add(new Wall(i * TILESIZE, j * TILESIZE, "assets/wall.png"));
        }
      }
    }
  }

  public List<GameObject> getGameFloor() {
    return gameFloor;
  }

  public boolean isWall(int i, int j) {
    return gameBoard[i][j] == 0;
  }

  public int[] getRandomCoordinate() {
    int[] randCoordinates = new int[2];
    int i = (int) (Math.random() * row);
    int j = (int) (Math.random() * col);
    while (isWall(i,j)) {
          i = (int) (Math.random() * row);
          j = (int) (Math.random() * col);
    }
    randCoordinates[0] = i * TILESIZE;
    randCoordinates[1] = j * TILESIZE;
    return randCoordinates;
  }

  public int getRow() {
    return row;
  }

  public int getCol() {
    return col;
  }

  public int getTILESIZE() {
    return TILESIZE;
  }
}