public class Station {
  int gasAmount = 1000;

  public void refill(Car car, int gas){
    gasAmount -= gas;
    car.gasAmount += gas;
  }

  public static void main(String[] args) {
    Car car = new Car(0, 100);
    Station petrolStation = new Station();

    petrolStation.refill(car,50);

    System.out.println(car.gasAmount);
    System.out.println(petrolStation.gasAmount);
  }
}
