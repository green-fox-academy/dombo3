import java.util.Scanner;

/**
 * Created by user on 2017.03.24..
 */
public class CreatePalindrome {
  public static void main(String[] args) {
    Scanner myscanner = new Scanner(System.in);
    System.out.println("Palondrinomiser, type in a word please: ");
    String word = myscanner.nextLine();

    System.out.println(Palindrome(word));
  }

  public static String Palindrome(String word) {
    for (int i = (word.length() - 1); i >= 0; i--) {
      word = word + word.charAt(i);
    }
    return word;
  }
}
