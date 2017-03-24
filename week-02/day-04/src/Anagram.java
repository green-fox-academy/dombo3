import java.util.*;

/**
 * Created by user on 2017.03.23..
 */
public class Anagram {
  public static void main(String[] args) {
    Scanner myscanner = new Scanner(System.in);
    System.out.println("Plese type in your first word: ");
    String word1 = myscanner.nextLine();
    System.out.println("Plese type in your second word: ");
    String word2 = myscanner.nextLine();

    System.out.println(IsAnagram(word1,word2));
  }

  public static String IsAnagram(String word1, String word2) {

    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();

    String[] word1Char = word1.split("");
    String[] word2Char = word2.split("");

    Arrays.sort(word1Char);
    Arrays.sort(word2Char);

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


    for (int i = 0; i < word1Char.length; i++) {
      /*System.out.println(word1Char[i]);*/
      abc1.put(word1Char[i], (abc1.get(word1Char[i]) + 1));
    }

    for (int i = 0; i < word2Char.length; i++) {
      /*System.out.println(word2Char[i]);*/
      abc2.put(word2Char[i], (abc2.get(word2Char[i]) + 1));
    }

    System.out.println(abc1);
    System.out.println(abc2);

    if (word1.length() != word2.length()) {
      return "Not an anagram";
    } else {
      for (int i = 0; i < word1Char.length; i++) {
        if (abc1.get(word1Char[i]) != abc2.get(word2Char[i])) {
          return "Not an anagram";
        }
      }
    }

    return "Is an Anagram";
  }
}
