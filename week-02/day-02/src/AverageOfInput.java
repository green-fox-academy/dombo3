import java.util.Scanner;

/**
 * Created by user on 2017.03.22..
 */
public class AverageOfInput {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Please type in an iteger: ");
    int num1 = myScanner.nextInt();
    System.out.println("Please type in another iteger: ");
    int num2 = myScanner.nextInt();
    System.out.println("Please type in again an iteger: ");
    int num3 = myScanner.nextInt();
    System.out.println("And again: ");
    int num4 = myScanner.nextInt();
    System.out.println("This is the last one: ");
    int num5 = myScanner.nextInt();

    int sum = num1 + num2 + num3 + num4 + num5;
    double average = sum / 5.;

    System.out.println("Sum: " + sum + ", Average: " + average);

  }
}
