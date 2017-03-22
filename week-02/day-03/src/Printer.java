import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by user on 2017.03.22..
 */
public class Printer {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Your first word: ");
    String userWord1 = myScanner.nextLine();
    System.out.println("Your second word: ");
    String userWord2 = myScanner.nextLine();
    System.out.println("Your third word: ");
    String userWord3 = myScanner.nextLine();

    printer(userWord1, userWord2, userWord3);
  }

  private static void printer(String arg1, String arg2, String arg3) {
    System.out.println(arg1);
    System.out.println(arg2);
    System.out.println(arg3);
  }
}
