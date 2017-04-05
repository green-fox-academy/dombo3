import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Extension {
  int add(int a, int b) {
    return a + b;
  }

  int maxOfThree(int a, int b, int c) {
    return Math.max(Math.max(a,b),c);
  }

  double median(List<Integer> pool) {
    Collections.sort(pool);
    if (pool.size() % 2 == 0) {
     return (double) (pool.get((pool.size()/2)) + pool.get(pool.size()/2 - 1)) /2;
    } else {
      return (double) pool.get((pool.size() - 1) / 2);
    }
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarian) {
    StringBuilder buildHungarian = new StringBuilder(hungarian);
    List<Integer> index = new ArrayList<>();

    for (int i = 0; i < buildHungarian.length(); i++) {
      if (isVowel(buildHungarian.charAt(i))) {
        index.add(i);
      };
    }
    for (int i = 0; i < index.size(); i ++) {
      buildHungarian.insert(index.get(i)+1+(i*2), "v" + hungarian.charAt(index.get(i)));
    }
    return buildHungarian.toString();
  }
}