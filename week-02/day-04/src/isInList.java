import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 2017.03.26..
 */
public class isInList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

    System.out.println(isInIt(list));
    // Check if list contains all of the following elements: 4,8,12,16
    // Print "true" if it contains all, otherwise print "false"
    // Can you do both the different approaches you tried in the previous one?
  }

  public static boolean isInIt(ArrayList list) {
    for (int i = 4; i <= 16; i += 4) {
      if (!list.contains(i)) {
        return false;
      }
    }
      return true;
  }



}
