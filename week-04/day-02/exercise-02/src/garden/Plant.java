package garden;

public class Plant {
  private int currentWater;
  private String name;
  private double absorbRate;
  private int thirstyLine;

  public Plant(int currentWater, String name, double absorbRate, int thirstyLine){
    this.currentWater = currentWater;
    this.name = name;
    this.absorbRate = absorbRate;
    this.thirstyLine = thirstyLine;
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

  public int getThirstyLine() {
    return thirstyLine;
  }

  public double getAbsorbRate() {
    return absorbRate;
  }
}

