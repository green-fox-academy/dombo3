import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by user on 2017.03.24..
 */
public class AnagramEasy {
  public static void main(String[] args) {
    Scanner myscanner = new Scanner(System.in);
    System.out.println("Plese type in your first word: ");
    String word1 = myscanner.nextLine();
    System.out.println("Plese type in your second word: ");
    String word2 = myscanner.nextLine();

    if (IsAnagram(word1, word2)) {
      System.out.println("It is an anagram");
    } else {
      System.out.println("It is not an anagram");
    }
  }

  public static boolean IsAnagram(String word1, String word2) {

    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();

    char[] word1Char = word1.toCharArray();
    char[] word2Char = word2.toCharArray();

    Arrays.sort(word1Char);
    Arrays.sort(word2Char);

    return Arrays.equals(word1Char, word2Char);
  }
}
