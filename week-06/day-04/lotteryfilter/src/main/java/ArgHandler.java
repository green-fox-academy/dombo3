import joptsimple.OptionException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class ArgHandler {
  OptionParser parser;
  OptionSet options;

  public OptionParser getParser() {
    return parser;
  }

  public OptionSet getOptions() {
    return options;
  }

  public ArgHandler(String[] args) {
    parser = new OptionParser();
    parser.accepts("y", "Read given year datas from 1957 to 2015").withRequiredArg().ofType(String.class);
    parser.accepts("f", "Read from file").withRequiredArg().ofType(String.class);
    parser.accepts("o", "Write data to").withRequiredArg().ofType(String.class);
    try {
      options = parser.parse(args);
    } catch (OptionException oe) {
      System.out.println("Missing argument");
      System.out.println("\n");
      try {
        parser.printHelpOn(System.out);
      } catch (Exception e) {
        e.getMessage();
      }
      oe.options();
      oe.getMessage();
    }

  }

}
