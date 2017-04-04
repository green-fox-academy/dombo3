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

  public List<Integer> checkFlowers() {
    List<Integer> flowersNeedsWater = new ArrayList<>();
    for (int i = 0; i < flowers.size(); i++) {
      if (flowers.get(i).currentWater < 5) {
        flowersNeedsWater.add(i);
      }
    }
    return flowersNeedsWater;
  }

  public List<Integer> checkTrees() {
    List<Integer> treesNeedsWater = new ArrayList<>();
    for (int i = 0; i < trees.size(); i++) {
      if (trees.get(i).currentWater < 10) {
        treesNeedsWater.add(i);
      }
    }
    return treesNeedsWater;
  }

  public int waterAmountPerPlant(int waterAmount){
    int plantNeedWater = checkFlowers().size() + checkTrees().size();
    int waterAmountPerPlant = 0;
    if (plantNeedWater == 0) {
      System.out.println("No plant needs water!");
    } else {
      waterAmountPerPlant = waterAmount/plantNeedWater;
    }
    return waterAmountPerPlant;
  }

  public void irrigate(int waterAmount) {
    for (int index : checkFlowers()) {
      flowers.get(index).setCurrentWater(flowers.get(index).getCurrentWater() +
              waterAmountPerPlant(waterAmount));
    }
    for (int index : checkTrees()) {
      trees.get(index).setCurrentWater(trees.get(index).getCurrentWater() +
              waterAmountPerPlant(waterAmount));
    }

    System.out.println("Watering with " + waterAmount + "!");
  }

  public void look() {
    for (Tree tree : trees) {
      if (tree.currentWater < 10) {
        System.out.println("The " + tree.getName() + " Tree does need water.");
      } else {
        System.out.println("The " + tree.getName() + " Tree doesn't need water.");
      }
    }

    for (Flower flower : flowers) {
      if (flower.currentWater < 5) {
        System.out.println("The " + flower.getName() + " Tree does need water.");
      } else {
        System.out.println("The " + flower.getName() + " Tree doesn't need water.");
      }
    }

  }
}
