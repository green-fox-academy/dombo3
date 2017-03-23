import java.util.*;
/**
 * Created by user on 2017.03.23..
 */
public class solarsystem {
  public static void main(String[] args) {
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth",
            "Mars","Jupiter","Uranus","Neptune"));

    // Saturn is missing from the planetList
    // Insert it into the correct position
    planetList.add(5, "Saturn");
    System.out.println(planetList);
  }
}
