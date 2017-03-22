import java.util.Scanner;

/**
 * Created by user on 2017.03.22..
 */
public class OddEven {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Please type in a number: ");
    int userNum = myScanner.nextInt();

    if (userNum % 2 == 0) {
      System.out.println("The number you typed in is even!");
    } else {
      System.out.println("The number you typed in is odd!");
    }

  }
}
