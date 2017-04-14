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
  private List<GameObject> characterList;

  public GameMap() {
    this.gameObjects = new ArrayList<>();
    this.characterList = new ArrayList<>();
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
  public List<GameObject> getCharacterList() {
    return characterList;
  }

  public int[][] getGameBoard() {
    return gameBoard;
  }

  public boolean isWall(int i, int j) {
    return gameBoard[i][j] == 0;
  }

//  public boolean isCharacterAtXY(int i, int j) {
//    for (GameObject g : characterList)
//      if (g.getPosX() == i * 72 && g.getPosY() == j * 72) {
//        return true;
//    }
//    return false;
//  }

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