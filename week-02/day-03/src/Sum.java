import java.util.Scanner;

/**
 * Created by user on 2017.03.22..
 */
public class Sum {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("I can count the sum of the numbers from 0 to the given number: ");
    int userNumber = myScanner.nextInt();

    System.out.println(sum(userNumber));
  }

  public static int sum(int num) {
    int summa = 0;
    for (int i = 1; i <= num; i++) {
      summa += i;
    }
    return summa;
  }
}
