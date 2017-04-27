import static java.util.Arrays.asList;

import java.io.IOException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class TodoApp {

  public static void main(String[] args) {
    OptionParser parser = new OptionParser() {
      {
        accepts("l", "Lists all the tasks");
        accepts("a", "Adds a new task");
        accepts("r", "Removes an task");
        accepts("c", "Completes an task");
        acceptsAll(asList("h", "?"), "Show help");
      }
    };

    OptionSet options = parser.parse(args);

    if (options.has("h")) {
      try {
        parser.printHelpOn(System.out);
      } catch (IOException e){
        e.getMessage();
      }
    }

  }
}