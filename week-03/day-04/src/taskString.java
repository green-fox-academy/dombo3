
public class taskString {
  public static void main(String[] args) {
    System.out.println(changeX("hahhoox"));
  }

  private static String changeX(String wordX) {
    String result;
    if (wordX.length() == 0) {
      return "";
    } else {
      if (wordX.charAt(0) == 'x') {
        result = 'y' + changeX(wordX.substring(1));
      } else {
        result = wordX.charAt(0) + changeX(wordX.substring(1));
      }
      return result;
    }
  }
}