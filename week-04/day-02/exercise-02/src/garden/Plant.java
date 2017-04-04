package garden;

public class Plant {
  int currentWater;
  int absorbRate;

  public Plant(int currentWater, int absorbRate){
    this.currentWater = currentWater;
    this.absorbRate = absorbRate;
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
}
