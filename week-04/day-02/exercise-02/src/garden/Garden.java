package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Flower> flowers;
  private List<Tree> trees;

  public Garden(){
    flowers = new ArrayList<>();
    trees = new ArrayList<>();
  }

  public void addFlower(Flower flower) {
    flowers.add(flower);
  }

  public void addTree(Tree tree) {
    trees.add(tree);
  }

  public int checkFlowers() {
    int flowerNeedWater = 0;
    for (int i = 0; i < flowers.size(); i++) {
      if (flowers.get(i).currentWater < 5) {
        flowerNeedWater += 1;
      }
    }
    return flowerNeedWater;
  }

  public int checkTrees() {
    int treeNeedWater = 0;
    for (int i = 0; i < flowers.size(); i++) {
      if (flowers.get(i).currentWater < 10) {
        treeNeedWater += 1;
      }
    }
    return treeNeedWater;
  }


  public int irrigate(int waterAmount){
    int plantNeedWater = checkFlowers() + checkTrees();
    if (plantNeedWater == 0) {
      System.out.println("No plant needs water!");
    } else {
      waterAmount = waterAmount/plantNeedWater;
    }

    return waterAmount;
  }
}
