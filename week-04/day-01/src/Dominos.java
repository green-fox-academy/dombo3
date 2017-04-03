import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominos {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();

    for (int i = 0; i < dominoes.size(); i++){
      int [] dominoA = dominoes.get(i).getValues();
      for (int j = i + 1; j < dominoes.size(); j++) {
        int [] dominoB = dominoes.get(j).getValues();
        if (dominoB[0] == dominoA[1]) {
          Collections.swap(dominoes, i + 1, j);
        }
      }
    }
    System.out.println(dominoes);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
