import GameObject.Board;
import GameObject.Coordinate;
import GameObject.Coordinates;

public class RPGame {
  public static void main(String[] args) {
    Board.BoardMain();
    Coordinates Floors = new Coordinates();

    for (int i = 0; i < Board.SIZEX; i++) {
      for (int j = 0; j < Board.SIZEY; j++) {
        if (Board.gameBoard[i][j] != 0)
        Floors.add(new Coordinate(i * Board.TILESIZE,j * Board.TILESIZE));
      }
    }
  }
}
