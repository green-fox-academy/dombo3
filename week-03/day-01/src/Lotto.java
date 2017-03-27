import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by user on 2017.03.27..
 */
public class Lotto {
  public static void main(String[] args) {
    try {
      Path filePath = Paths.get("assets/otos.csv");
      List<String> lines = Files.readAllLines(filePath);
      for (String line : lines) {
        System.out.println(line.toUpperCase());
      }
    } catch (Exception e) {
      System.out.println("Error happened: " + e.getClass());
    }


  }
}
