import java.util.List;

public class LotteryFilter {

  public static void main(String[] args) {
    ArgHandler myArgHandler = new ArgHandler(args);
    CsvHandler myHandler = new CsvHandler();

    if (myArgHandler.getOptions().has("y")) {
      List<String[]> lines = myHandler.readFile("assets/otos.csv");
      myHandler.writeFileLines("assets/output.csv", lines);
    }

    List<String[]> lines2015 = myHandler.getLinesByDate("assets/otos.csv","2015");
    myHandler.writeFileLines("assets/result", lines2015);
  }
}