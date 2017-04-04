import garden.*;

public class GardenApp {
  public static void main(String[] args) {

    Garden myGarden = new Garden();

    Plant yellow = new Flower(25,75, "yellow");
    Plant blue = new Flower(3,75, "blue");
    Plant purple = new Tree(9, "purple");
    Plant orange = new Tree(30, "orange");

    myGarden.addFlower((Flower) yellow);
    myGarden.addFlower((Flower) blue);
    myGarden.addTree((Tree) purple);
    myGarden.addTree((Tree) orange);

    myGarden.look();
    myGarden.irrigate(40);
    myGarden.look();
  }
}
