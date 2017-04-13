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

  private List<GameObject> gameObjects;

  public GameMap() {
    this.gameObjects = new ArrayList<>();
  }

  public void fillMap() {
    int row = gameBoard.length;
    int col = gameBoard[0].length;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (gameBoard[j][i] == 1) {
          gameObjects.add(new Floor(i * 72, j * 72, "assets/floor.png"));
        } else if (gameBoard[j][i] == 0) {
          gameObjects.add(new Wall(i * 72, j * 72, "assets/wall.png"));
        }
      }
    }
  }

  public List<GameObject> getGameObjects() {
    return gameObjects;
  }

  public int[][] getGameBoard() {
    return gameBoard;
  }
}