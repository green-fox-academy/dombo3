import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Farm {
  private ArrayList<Animal> farm;
  private int counter = 0;

  public Farm(){
    this.farm = new ArrayList<>(10);
    System.out.println("You have just constructed a farm with initial capacity of 10");
  }

  public int slots() {
    System.out.println("Available slots in your farm: " + (10 - counter));
    return (10 - counter);
  }

  public void breed() {
    if (counter < 10) {
      this.farm.add(new Animal());
      counter += 1;
    } else {
      System.out.println("I am sorry, your farm is full.");
    }
  }

  public void slaughter() {
    int minHunnger = 50;
    for (int i = 0; i < farm.size(); i++){
      if (farm.get(i).hunger < minHunnger) {
        minHunnger = farm.get(i).hunger;
      }
    }
    for (int i = 0; i < farm.size(); i++){
      if (farm.get(i).hunger == minHunnger){
        farm.remove(i);
      }
    }
    counter -= 1;
  }
}
