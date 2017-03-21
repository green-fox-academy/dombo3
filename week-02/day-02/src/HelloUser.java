import java.util.Scanner;
/**
 * Created by user on 2017.03.21..
 */

public class HelloUser {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please type in your name: ");
    String userName = scanner.nextLine();
    System.out.println("Hello, " + userName + "!");
  }
}
