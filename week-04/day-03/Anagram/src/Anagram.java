import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Anagram {

  public Anagram() {
  }

  public boolean isAnagram(String word1, String word2) {
    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();

    char[] word1Char = word1.toCharArray();
    char[] word2Char = word2.toCharArray();

    Arrays.sort(word1Char);
    Arrays.sort(word2Char);

    return Arrays.equals(word1Char, word2Char);
  }
}
