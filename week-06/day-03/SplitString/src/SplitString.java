import java.util.ArrayList;
import java.util.List;

public class SplitString {
  public static void main(String[] args) {
    try {
      System.out.println(splitString("lovebarbara",12));
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("You fool");
    }
  }

  public static List<String> splitString(String string, int num) {
    List<String> result = new ArrayList<>(2);
    result.add(string.substring(0, num));
    result.add(string.substring(num));
    return result;
  }
}
