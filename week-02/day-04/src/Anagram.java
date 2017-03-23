import java.util.*;

/**
 * Created by user on 2017.03.23..
 */
public class Anagram {
  public static void main(String[] args) {
    String word1 = "dog";
    String word2 = "god";

    String[] word1Char = word1.split("");
    String[] word2Char = word2.split("");

    Map<String, Integer> abc1 = new HashMap<>();
    Map<String, Integer> abc2 = new HashMap<>();

    abc1.put("a", 0);
    abc1.put("b", 0);
    abc1.put("c", 0);
    abc1.put("d", 0);
    abc1.put("e", 0);
    abc1.put("f", 0);
    abc1.put("g", 0);
    abc1.put("h", 0);
    abc1.put("i", 0);
    abc1.put("j", 0);
    abc1.put("k", 0);
    abc1.put("l", 0);
    abc1.put("m", 0);
    abc1.put("n", 0);
    abc1.put("o", 0);
    abc1.put("p", 0);
    abc1.put("q", 0);
    abc1.put("r", 0);
    abc1.put("s", 0);
    abc1.put("t", 0);
    abc1.put("u", 0);
    abc1.put("v", 0);
    abc1.put("w", 0);
    abc1.put("x", 0);
    abc1.put("y", 0);
    abc1.put("z", 0);

    abc2.putAll(abc1);

    // Get a set of the entries
    Set set = abc1.entrySet();

    // Get an iterator
    Iterator i = set.iterator();

    while(i.hasNext()) {
      Map.Entry me = (Map.Entry)i.next();
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
    }
    System.out.println();

    Integer letter = abc1.get("a");
    abc1.put("a", 1);
    System.out.println("a's new balance: " + abc1.get("a"));
    System.out.println(abc1);
  }
}
