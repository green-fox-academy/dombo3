/**
 * Created by user on 2017.03.21..
 */
public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;
    int secondsADay = 86400;
    int currentTimeSec = currentHours * 60 * 60 + currentMinutes * 60 + currentSeconds;

    System.out.println("Remaining seconds: " + (secondsADay - currentTimeSec));
  }
}
