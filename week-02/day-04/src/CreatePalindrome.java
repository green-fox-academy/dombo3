/**
 * Created by user on 2017.03.24..
 */
public class CreatePalindrome {
  public static void main(String[] args) {

    System.out.println(Palindrome("Palindrome ready"));
  }

  public static String Palindrome(String word) {
    char[] wordChar = word.toCharArray();

    for (int i = 0; i < wordChar.length; i++) {
      word = word + wordChar[i];
    }
    return word;
  }
}
