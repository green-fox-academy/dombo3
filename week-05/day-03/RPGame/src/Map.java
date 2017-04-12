import GameObjects.Floor;
import GameObjects.GameObject;
import GameObjects.Wall;

import java.util.ArrayList;
import java.util.List;

public class Map {
  private int[][] gameBoard;
  private List<List<GameObject>> gameObjects;

  public Map() {
    this.gameBoard = new int[][]{
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

    this.gameObjects = new ArrayList<List<GameObject>>();
  }

  public void fillMap() {
    int row = gameBoard.length;
    int col = gameBoard[0].length;

    for (int i = 0; i < row; i++) {
      List<GameObject> tempArrayList = new ArrayList<>();
      gameObjects.add(tempArrayList);
      for (int j = 0; j < col; j++) {
        if (gameBoard[i][j] == 1) {
          tempArrayList.add(new Floor(i * 72, j * 72, "assets/floor.png"));
        } else if (gameBoard[j][i] == 0) {
          tempArrayList.add(new Wall(i * 72, j * 72, "assets/wall.png"));
        }
      }
    }
  }

  public List<List<GameObject>> getGameObjects() {
    return gameObjects;
  }
}