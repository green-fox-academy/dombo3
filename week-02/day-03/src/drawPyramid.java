import java.util.Collections;
import java.util.Scanner;

/**
 * Created by user on 2017.03.25..
 */
public class drawPyramid {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int userNumber = myScanner.nextInt();

    int num = userNumber - 1;
    int k = num;
    for (int i = num ; i >= 0; i--) {
      System.out.println(String.join("", Collections.nCopies(i," ")) + String.join("",
              Collections.nCopies((k - i) * 2,"*")) + "*");
    }
  }
}
