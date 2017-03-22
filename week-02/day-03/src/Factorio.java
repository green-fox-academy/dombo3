import java.util.Scanner;

/**
 * Created by user on 2017.03.22..
 */
public class Factorio {
  public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("I can count the factorio of the given number: ");
    int userNumber = myScanner.nextInt();

    System.out.println(factorio(userNumber));
  }

  public static int factorio(int num) {
    int factorioResult = 1;
    for (int i = 1; i <= num; i++) {
      factorioResult *= i;
    }
    return factorioResult;
  }
}
