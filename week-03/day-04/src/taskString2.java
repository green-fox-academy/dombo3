
public class taskString2 {
  public static void main(String[] args) {
    System.out.println(removeX("hahxxxhoox"));
  }

  private static String removeX(String wordX) {
    String result;
    if (wordX.length() == 0) {
      return "";
    } else {
      if (wordX.charAt(0) == 'x') {
        return removeX(wordX.substring(1));
      } else {
        return wordX.charAt(0) + removeX(wordX.substring(1));
      }
    }
  }
}
