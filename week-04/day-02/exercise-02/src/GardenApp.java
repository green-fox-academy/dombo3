import garden.*;

public class GardenApp {
  public static void main(String[] args) {

    Garden myGarden = new Garden();

    Plant yellow = new Flower(0,"yellow");
    Plant blue = new Flower(0, "blue");
    Plant purple = new Tree(0, "purple");
    Plant orange = new Tree(0, "orange");

    myGarden.addPlant(yellow);
    myGarden.addPlant(blue);
    myGarden.addPlant(purple);
    myGarden.addPlant(orange);

    myGarden.look();
    myGarden.irrigate(40);
    myGarden.look();
    myGarden.irrigate(70);
    myGarden.look();
    myGarden.irrigate(70);
    myGarden.look();
  }
}
