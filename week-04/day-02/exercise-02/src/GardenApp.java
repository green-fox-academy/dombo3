import garden.*;

public class GardenApp {
  public static void main(String[] args) {

    Garden myGarden = new Garden();

    Plant yellow = new Flower(1,"yellow");
    Plant blue = new Flower(1, "blue");
    Plant purple = new Tree(1, "purple");
    Plant orange = new Tree(1, "orange");

    myGarden.addPlant(yellow);
    myGarden.addPlant(blue);
    myGarden.addPlant(purple);
    myGarden.addPlant(orange);

    myGarden.look();
    myGarden.irrigate(40);
    myGarden.look();
    myGarden.irrigate(70);
    myGarden.look();
  }
}
