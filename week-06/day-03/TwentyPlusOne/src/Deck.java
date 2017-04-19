import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
  List<Card> deck;

  public Deck(int cards) {
    if (cards > 52) {
      System.out.println("Cannot create more than 52 cards deck.");
    } else {
      deck = new ArrayList<>();

      for (int i = 0; i < cards; i++) {
        Card card = new Card();
        while (checkCard(card)) {
          card = new Card();
        }
        deck.add(card);
      }
    }
  }

  public boolean checkCard(Card card) {
    for(Card cardy : deck) {
      if (card.getSuit() == cardy.getSuit() && card.getRank() == cardy.getRank()) {
        return true;
      }
    }
    return false;
  }

  public void shuffleDeck() {
    Collections.shuffle(deck);
  }

  public Card pullFirst() {
    Card drawn = deck.get(0);
    deck.remove(0);
    return drawn;
  }

  public Card pullLast() {
    Card drawn = deck.get(deck.size()-1);
    deck.remove(deck.size()-1);
    return drawn;
  }

  public Card pullRandom() {
    Random rand = new Random();
    int n = rand.nextInt(deck.size());
    Card drawn = deck.get(n);
    deck.remove(n);
    return drawn;
  }

  @Override
  public String toString(){
    String result = "";
    for (Card card : deck) {
      result += card + ", ";
    }
    return result;
  }
}
