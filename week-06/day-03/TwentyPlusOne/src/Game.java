import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    Deck deck = new Deck(52);
    Random rand = new Random();
    int opponent = rand.nextInt(6) + 15;
    int player = deck.pullFirst().getRank().getRankpoint();
    System.out.println("Your score: " + player);

    while (player < 21) {
      System.out.println("Do you want to pull another card? Y/N");
      Scanner scanner = new Scanner(System.in);
      String answer = scanner.nextLine();
      if ("y".equals(answer.toLowerCase())) {
        player += deck.pullFirst().getRank().getRankpoint();
        System.out.println("Your score: " + player);
      } else if ("n".equals(answer.toLowerCase())) {
        break;
      } else {
        System.out.println("please type in y or n");
      }
    }

    System.out.println("Your score: " + player);
    System.out.println("The House score: " + opponent);
  }
}
