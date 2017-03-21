import java.util.Scanner;
/**
 * Created by user on 2017.03.21..
 */
public class MileToKmConverter {
  public static void main(String[] args) {
    double distanceKm;
    double distanceMile;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Add kilometers you want to convert into miles, please: ");
    distanceKm = scanner.nextDouble();
    distanceMile = distanceKm * 0.621371192;
    System.out.println(distanceMile);

  }
}
