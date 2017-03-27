import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by user on 2017.03.27..
 */
public class Doubled {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("assets/duplicated-chars.txt");
      List<String> lines = Files.readAllLines(path);
      System.out.println(lines);

    } catch (Exception e){
      System.out.println("Exception occured: " + e.getClass());
    }
  }
}
