import java.util.Scanner;

/**
 * Created by user on 2017.03.22..
 */
public class CountFromTo {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Please type in the first number: ");
    int userNum1 = myScanner.nextInt();
    System.out.println("Please type in the second number: ");
    int userNum2 = myScanner.nextInt();

    if (userNum2 < userNum1) {
      System.out.println("The second number should be bigger");
    } else {
      for (int i = userNum1; i < userNum2; i++) {
        System.out.println(i);
      }
    }

  }
}
