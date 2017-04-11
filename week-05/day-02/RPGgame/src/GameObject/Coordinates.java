package GameObject;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {
  private List<Coordinate> coordinates;

  public Coordinates(){
    this.coordinates = new ArrayList<>();
  }

  public void add(Coordinate coordinate) {
    coordinates.add(coordinate);
  }

  public List<Coordinate> getCoordinates() {
    return coordinates;
  }
}
