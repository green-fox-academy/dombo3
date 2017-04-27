import java.util.List;

public class LotteryFilter {

  public static void main(String[] args) {
    ArgHandler myArgHandler = new ArgHandler(args);
    CsvHandler myHandler = new CsvHandler();
    String inputFile;
    String outputFile;

    if (myArgHandler.getOptions().hasArgument("f")) {
      inputFile = (String) myArgHandler.getOptions().valueOf("f");
    } else {
      inputFile = "assets/otos.csv";
    }

    if (myArgHandler.getOptions().hasArgument("o")) {
      outputFile = (String) myArgHandler.getOptions().valueOf("o");
    } else {
      outputFile = "assets/output.csv";
    }

    if (myArgHandler.getOptions().hasArgument("y")) {
      String year = (String) myArgHandler.getOptions().valueOf("y");
      List<String[]> lines = myHandler.getLinesByDate(inputFile, year);
      myHandler.writeFileLines(outputFile, lines);
    }
  }
}