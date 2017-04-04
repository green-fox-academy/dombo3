import garden.*;

public class GardenApp {
  public static void main(String[] args) {

    Garden myGarden = new Garden();

    Plant yellow = new Flower(25,75);
    Plant blue = new Flower(10,75);
    Plant purple = new Tree(40, 40);
    Plant orange = new Tree(30, 40);

    myGarden.addFlower((Flower) yellow);
    myGarden.addFlower((Flower) blue);
    myGarden.addTree((Tree) purple);
    myGarden.addTree((Tree) orange);

    myGarden.irrigate(40);
  }
}
