import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 2017.03.26..
 */
public class elementFinder {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 7));
    if (arrayList.contains(7)) {
      System.out.println("Hoorray");
    } else {
      System.out.println("Noooooo");
    }

    if (listContains(arrayList)) {
      System.out.println("Hoorrray");
    } else {
      System.out.println("Noooooo");
    }

  }
  public static boolean listContains(ArrayList arrayList) {
    for (int i = 0; i < arrayList.size(); i++) {
      int listNum = (int) arrayList.get(i);
      if (listNum == 7) {
        return true;
      }
    }

    return false;
  }
}
