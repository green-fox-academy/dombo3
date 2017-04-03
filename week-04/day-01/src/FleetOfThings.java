public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    Thing milk = new Thing("Get milk");
    Thing obstacles = new Thing ("Remove the obstacles");
    Thing stand = new Thing ("Stand up");
    Thing lunch = new Thing ("Eat lunch");

    stand.complete();
    lunch.complete();

    fleet.add(milk);
    fleet.add(obstacles);
    fleet.add(stand);
    fleet.add(lunch);

    fleet.toString();

    System.out.println(fleet);
  }
}