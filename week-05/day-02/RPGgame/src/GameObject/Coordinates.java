package GameObject;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {
  private static List<Coordinate> coordinates;

  public Coordinates(){
    this.coordinates = new ArrayList<>();
  }

  public void add(Coordinate coordinate) {
    coordinates.add(coordinate);
  }

  public static List<Coordinate> getCoordinates() {
    return coordinates;
  }
}
