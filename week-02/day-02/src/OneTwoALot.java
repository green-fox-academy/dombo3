import java.util.Scanner;

/**
 * Created by user on 2017.03.22..
 */
public class OneTwoALot {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Please type in a number: ");
    int userNum = myScanner.nextInt();

    if (userNum <= 0) {
      System.out.println("Not enough");
    } else if (userNum == 1) {
      System.out.println("One");
    } else if (userNum == 2) {
      System.out.println("Two");
    } else {
      System.out.println("A lot");
    }
  }
}
