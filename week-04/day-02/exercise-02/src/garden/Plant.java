package garden;

public class Plant {
  int currentWater;
  int absorbRate;

  public Plant(int currentWater, int absorbRate){
    this.currentWater = currentWater;
    this.absorbRate = absorbRate;
  }

  public void getCurrentWater() {
    System.out.println(currentWater);
  }

  public void getAbsorbRate() {
    System.out.println(absorbRate);
  }
}
