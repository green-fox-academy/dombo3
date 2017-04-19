import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Suit {
  CLUBS(Color.BLACK),DIAMONDS(Color.RED), HEARTS(Color.RED), SPADES(Color.BLACK);

  private Color color;

  Suit(Color color) {
    this.color = color;
  }

  private static final List<Suit> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
  private static final int SIZE = VALUES.size();
  public static final Random RANDOM = new Random();

  public static Suit randomSuit()  {
    return VALUES.get(RANDOM.nextInt(SIZE));
  }

  public enum Color {
    RED(),BLACK();
  };
}
