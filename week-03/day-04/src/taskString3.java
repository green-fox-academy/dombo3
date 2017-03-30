/**
 * Created by user on 2017.03.30..
 */
public class taskString3 {
  public static void main(String[] args) {
    System.out.println(removeX("hahxxxhoox"));
  }

  private static String removeX(String wordX) {
    String result;
    if (wordX.length() == 0) {
      return "";
    } else {
      result = wordX.charAt(0) + "*" + removeX(wordX.substring(1));
      return result;
    }
  }
}
