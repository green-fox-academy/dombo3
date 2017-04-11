package GameObject;

public class Monster {

  private int PosX;
  private int PosY;
  private String name;

  public Monster() {
    this.name = "Joe";
    this.PosX = monsterXY.getX();
    this.PosY = monsterXY.getY();
  }

  Coordinate monsterXY = getFloorCoordinates().getCoordinates().get((int) (Math.random() *
  getFloorCoordinates().getCoordinates().size()));

  public Coordinates getFloorCoordinates() {
    Coordinates Floors = new Coordinates();

    for (int i = 0; i < Board.SIZEX; i++) {
      for (int j = 0; j < Board.SIZEY; j++) {
        if (Board.gameBoard[i][j] != 0)
          Floors.add(new Coordinate(j * Board.TILESIZE,i * Board.TILESIZE));
      }
    }
    return Floors;
  }

  public int getPosX() {
    return PosX;
  }

  public int getPosY() {
    return PosY;
  }

  public String getName() {
    return name;
  }
}
