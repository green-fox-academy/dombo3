package GameObjects;

import java.util.ArrayList;
import java.util.List;

public class GameMap {
  public static int[][] gameBoard = new int[][]{
          {1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
          {1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
          {1, 0, 0, 0, 1, 0, 1, 0, 0, 1},
          {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
          {0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
          {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
          {1, 0, 1, 0, 1, 0, 0, 1, 0, 1},
          {1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
          {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
          {1, 1, 1, 0, 1, 0, 0, 1, 1, 1},
  };

  private List<GameObject> gameFloor;
  public int gameLevel = 0;

  public GameMap() {
    this.gameFloor = new ArrayList<>();
    gameLevel += 1;
  }

  public void fillMap() {
    int row = gameBoard.length;
    int col = gameBoard[0].length;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (gameBoard[j][i] == 1) {
          gameFloor.add(new Floor(i * 72, j * 72, "assets/floor.png"));
        } else if (gameBoard[j][i] == 0) {
          gameFloor.add(new Wall(i * 72, j * 72, "assets/wall.png"));
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
    int i = 0;
    int j = 3;
    while (isWall(i,j)) {
          i = (int) (Math.random() * 10);
          j = (int) (Math.random() * 10);
    }
    randCoordinates[0] = i * 72;
    randCoordinates[1] = j * 72;
    return randCoordinates;
  }
}