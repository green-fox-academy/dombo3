import java.util.*;

public class Card {
  private Suit suit;
  private Rank rank;

  public Card() {
    this.suit = Suit.randomSuit();
    this.rank = Rank.randomRank();
  }
}