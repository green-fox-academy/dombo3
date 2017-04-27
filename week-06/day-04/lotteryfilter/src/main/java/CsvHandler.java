import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CsvHandler {

  CSVReader reader;
  Iterator<String[]> iterator;

  public List<String[]> readFile(String fileName) {
    List<String[]> lines;
    try {
      reader = new CSVReader(new FileReader(fileName), ';');
      lines = reader.readAll();
    } catch (IOException e) {
      lines = new ArrayList<>();
      e.getMessage();
    }
    return lines;
  }

  public void writeFileLines(String fileName, List<String[]> lines) {
    try {
      CSVWriter writer = new CSVWriter(new FileWriter(fileName),';',
          CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(lines);
      writer.close();
    } catch (IOException e) {
      e.getMessage();
    }
  }

  public List<String[]> getLinesByDate(String fileName, String date) {
    List<String[]> resultLines = new ArrayList<>();

    try {
      iterator = readFile(fileName).iterator();
    } catch (Exception e) {
      e.getMessage();
    }

    while (iterator.hasNext()) {
      String[] line = iterator.next();
      if(line[0].equals(date)) {
        resultLines.add(line);
      }
    }
    return resultLines;
  }

}
