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
}
