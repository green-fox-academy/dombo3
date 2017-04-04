package garden;

public class Plant {
  private int currentWater;
  private String name;
  private int absorbRate;

  public Plant(int currentWater, String name, int absorbRate){
    this.currentWater = currentWater;
    this.name = name;
    this.absorbRate = absorbRate;
  }

  public int getCurrentWater() {
    return currentWater;
  }

  public void setCurrentWater(int currentWater) {
    this.currentWater = currentWater;
  }

  public String getName() {
    return name;
  }

  public int getAbsorbRate() {
    return absorbRate;
  }
}

