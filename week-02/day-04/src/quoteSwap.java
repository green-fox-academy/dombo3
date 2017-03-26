import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 2017.03.26..
 */
public class quoteSwap {
  public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<>(Arrays.asList("What", "I", "do", "create,", "I",
            "cannot", "not", "understand."));

    myList.set(2,"cannot");
    myList.set(5,"do");

    String correct = "";

    for (int i = 0; i < myList.size(); i++){
      correct += myList.get(i) + " ";
    }
    System.out.println(correct);
  }
}