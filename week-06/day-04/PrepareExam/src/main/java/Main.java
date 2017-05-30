import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {

  public static void main(String[] args) {
    OptionParser parser = new OptionParser();
    List<String[]> lines = new ArrayList<>();
    String readFrom = "otos.csv";
    String writeTo = "output.csv";
    List<String[]> writeLines = null;

    parser.accepts("y", "year").withRequiredArg().ofType(String.class);
    parser.accepts("f", "inputfile").withRequiredArg().ofType(String.class);
    parser.accepts("o", "outputfile").withRequiredArg().ofType(String.class);
    parser.accepts("h", "get help");
    OptionSet options = parser.parse("-y", "2015", "-f", "input.csv", "-o", "greenfox.csv");

    if (options.has("h")) {
      try {
        parser.printHelpOn(System.out);
      } catch (IOException e) {
        e.getMessage();
      }
    }

    if (options.has("f")) {
      System.out.println("Option f was triggered with " + options.valueOf("f"));
      readFrom = (String) options.valueOf("f");
    }

    try {
      CSVReader reader = new CSVReader(new FileReader("assets/" + readFrom), ';');
      lines = reader.readAll();
      writeLines = lines;
    } catch (IOException e) {
      e.getMessage();
    }

    if (options.has("y")) {
      System.out.println("Option y was triggered with " + options.valueOf("y"));
      writeLines = getLinesOfYear(lines,(String) options.valueOf("y"));
    }

    if (options.has("o")) {
      System.out.println("Option o was triggered with " + options.valueOf("o"));
      writeTo = (String) options.valueOf("o");
    }

    try {
      CSVWriter writer = new CSVWriter(new FileWriter("assets/" + writeTo), ';',
          CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(writeLines);
      writer.close();
    } catch (IOException e) {
      e.getMessage();
    }
  }

  public static List<String[]> getLinesOfYear(List<String[]> lines, String year) {
    List<String[]> linesOfCertainYear = new ArrayList<>();
    for (String[] line : lines) {
      if (line[0].equals(year)) {
        linesOfCertainYear.add(line);
      }
    }
    return linesOfCertainYear;
  }
}
