import java.util.Scanner;
/**
 * Created by user on 2017.03.22..
 */
public class AnimalsAndLegs {
  public static void main(String[] args) {
    Scanner myscanner = new Scanner(System.in);

    System.out.println("Please type in an integer: ");
    int chickens = myscanner.nextInt();
    System.out.println("Please type in another integer: ");
    int pigs = myscanner.nextInt();
    int legsInFarm = chickens * 2 + pigs * 4;

    System.out.println("Your Farm has " + chickens + " chickens, and " + pigs + " pigs.\nSo you " +
            "can find " + legsInFarm + " legs on your Farm.");
  }
}
