/**
 * Created by user on 2017.03.24..
 */
public class CreatePalindrome {
  public static void main(String[] args) {

    System.out.println(Palindrome("Palindrome ready"));
  }

  public static String Palindrome(String word) {
    for (int i = (word.length() - 1); i >= 0; i--) {
      word = word + word.charAt(i);
    }
    return word;
  }
}
