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

  public boolean isWall() {
    for (GameObject g : gameObjects) {
      if (g.getCostume().equals("assets/wall.png")) {
        return true;
      }
    }
    return false;
  }

  public boolean anotherisWall(int x, int y) {
    return gameBoard[x/72][y/72] == 1;
  }

  public boolean isCharacter(int posX, int posY) {
    for (GameObject g : characterList)
      if (g.getPosX() == posX && g.getPosY() == posY) {
      return true;
    }
    return false;
  }

  public int[] getRandomCoordinate() {
    int[] coordinates = new int[2];
    int X = (int) (Math.random() * 10) * 72;
    int Y = (int) (Math.random() * 10) * 72;

    while (anotherisWall(X,Y) || isCharacter(X,Y)) {
        X = (int) (Math.random() * 10) * 72;
        Y = (int) (Math.random() * 10) * 72;
    }

    coordinates[0] = X;
    coordinates[1] = Y;

    return coordinates;
  }
}