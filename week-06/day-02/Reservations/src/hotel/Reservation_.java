package hotel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Reservation_ implements Reservation {
  protected String code;
  protected String DOW;

  public Reservation_() {
  }

  @Override
  public String getDowBooking() {
    final List<String> days = new ArrayList<>(Arrays.asList("MON", "TUE", "WED", "THU", "FRI",
            "SAT", "SUN"));
    Random r = new Random();
    this.DOW = days.get(r.nextInt(8));
    return DOW;
  }

  @Override
  public String getCodeBooking() {
    this.code = "";
    final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVW";
    final int N = alphabet.length();
    Random r = new Random();
    for (int i = 0; i < 8; i++) {
      this.code += alphabet.charAt(r.nextInt(N));
    }
    return code;
  }

  @Override
  public String toString() {
    return String.format("Booking# %s for %s", getCodeBooking(),getDowBooking());
  }
}
