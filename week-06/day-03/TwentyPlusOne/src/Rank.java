import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Rank {
  TWO(2), THREE(3), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), J(10), Q(10), K(10), A
          (11);

  private int Rankpoint;

  Rank(int points) {
    this.Rankpoint = points;
  }

  public int getRankpoints() {
    return this.Rankpoint;
  }

  private static final List<Rank> VALUES =
          Collections.unmodifiableList(Arrays.asList(values()));
  private static final int SIZE = VALUES.size();
  private static final Random RANDOM = new Random();

  public static Rank randomRank() {
    return VALUES.get(RANDOM.nextInt(SIZE));
  }
}