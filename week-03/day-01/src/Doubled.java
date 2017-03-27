import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  final public static String TXT_PATH = "assets/duplicated-chars.txt";
  public static void main(String[] args) {
    List<String> lines = readFileLines();

    List<StringBuilder> decrypLines = new ArrayList<>();
    for (int i = 0; i < lines.size(); i++) {
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < lines.get(i).length(); j += 2) {
        sb.append(lines.get(i).charAt(j));
      }
      decrypLines.add(sb);
    }
    System.out.println(decrypLines);
  }

  public static List<String> readFileLines() {
    List<String> lines;
    try {
      Path path = Paths.get(TXT_PATH);
      lines = Files.readAllLines(path);
    } catch (Exception e){
      System.out.println("Exception occured: " + e.getClass());
      lines = new ArrayList<>();
    }
    System.out.println("File is loaded");
    return lines;
  }
}
