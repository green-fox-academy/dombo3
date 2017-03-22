import java.util.Scanner;

/**
 * Created by user on 2017.03.22..
 */
public class PrintBigger {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Please type in a number: ");
    int userNum1 = myScanner.nextInt();
    System.out.println("Please type another a number: ");
    int userNum2 = myScanner.nextInt();

    if (userNum1 < userNum2) {
      System.out.println(userNum2);
    } else {
      System.out.println(userNum1);
    }

  }
}
