import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  final public static String TXT_PATH = "assets/duplicated-chars.txt";
  final public static String DECRYPT_TXT = "assets/decrypted-chars.txt";

  public static void main(String[] args) {
    List<String> lines = readFileLines();
    List<StringBuilder> decryptedText = decrypter(lines);
    writeFileLines(decryptedText);
  }

  public static List<StringBuilder> decrypter(List<String> lines) {
      List<StringBuilder> decryptLines = new ArrayList<>();
      for (int i = 0; i < lines.size(); i++) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < lines.get(i).length(); j += 2) {
          sb.append(lines.get(i).charAt(j));
        }
        decryptLines.add(sb);
      }
      return decryptLines;
    }

  public static void writeFileLines(List<StringBuilder> decryptedText) {
    try {
      Path path = Paths.get(DECRYPT_TXT);
      Files.write(path, decryptedText);
      System.out.println("Mission accomplished. The TEXT is decrypted...");
      System.out.println("Check file at: " + DECRYPT_TXT);
    } catch (IOException e) {
      System.out.println("Exception occured: " + e.getClass());
    }
  }

  public static List<String> readFileLines() {
    List<String> lines;
    try {
      Path path = Paths.get(TXT_PATH);
      lines = Files.readAllLines(path);
    } catch (IOException e){
      System.out.println("Exception occured: " + e.getClass());
      lines = new ArrayList<>();
    }
    System.out.println("File is loaded");
    return lines;
  }
}
