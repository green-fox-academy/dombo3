package garden;

public class Plant {
  int currentWater;
  int absorbRate;
  String name;

  public Plant(int currentWater, int absorbRate, String name){
    this.currentWater = currentWater;
    this.absorbRate = absorbRate;
    this.name = name;
  }

  public int getCurrentWater() {
    return currentWater;
  }

  public void getAbsorbRate() {
    System.out.println(absorbRate);
  }

  public void setCurrentWater(int currentWater) {
    this.currentWater = currentWater;
  }

  public String getName() {
    return name;
  }
}

