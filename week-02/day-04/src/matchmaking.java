import java.util.*;
/**
 * Created by user on 2017.03.23..
 */
public class matchmaking {
  public static void main(String[] args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat",
            "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd",
            "Neef", "Jeff"));
    ArrayList<String> order = new ArrayList<String>();

    for (int i = 0; i < whichIsBigger(boys,girls).size(); i++) {
      if (whichIsBigger(boys,girls) == boys) {
        if (i  < girls.size()) {
          order.add(girls.get(i));
        }
          order.add(boys.get(i));
      } else {
        if (i < boys.size()) {
          order.add(boys.get(i));
        }
        order.add(girls.get(i));
      }
    }
    System.out.println(order);
  }

  public static ArrayList<String> whichIsBigger(ArrayList<String> listOne, ArrayList<String> listTwo) {
    if (listOne.size() > listTwo.size()) {
      return listOne;
    } else {
      return listTwo;
    }

  }
}
