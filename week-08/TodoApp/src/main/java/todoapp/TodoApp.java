package todoapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TodoApp {
  Todos myTodoList;
  List<Command> commands;

  public TodoApp() {
    myTodoList = processData(readFileLines());
    commands = new ArrayList<>();
    commands.add(new ListCommand());
    commands.add(new AddCommand());
    commands.add(new RemoveCommand());
    commands.add(new CompleteCommand());
  }

  public String runUsage() {
    String usage = "Python Todo application\n" +
        "=======================\n" +
        "Command line arguments:\n";
    for (Command command : commands) {
      usage += command.getUsage() + "\n";
    }
    return usage;
  }

  public String run(String[] args) {
    if (args.length == 0) {
      return runUsage();
    }

    for (Command command : commands) {
      if (("-" + command.getFlag()).equals(args[0])) {
        String execute = command.execute(myTodoList,args);
        writeFileLines(myTodoList.createStringList());
        return execute;
      }
    }

    return "";
  }

  public static void writeFileLines(List<String> todos) {
    try {
      Path path = Paths.get("assets/todos.csv");
      Files.write(path, todos);
    } catch (IOException e) {
      System.out.println("Exception occured: " + e.getClass());
    }
  }

  public static List<String> readFileLines() {
    List<String> lines;
    try {
      Path path = Paths.get("assets/todos.csv");
      lines = Files.readAllLines(path);
    } catch (IOException e) {
      System.out.println("Exception occured: " + e.getClass());
      lines = new ArrayList<>();
    }
    return lines;
  }

  public static Todos processData(List<String> rawLines) {
    Todos myTodos = new Todos();

    for (String line : rawLines) {
      String[] splittedLine = line.split(";");

      String todo = splittedLine[0];
      boolean completed = (Integer.parseInt(splittedLine[1]) == 1);

      myTodos.add(new Todo(todo, completed));
    }

    return myTodos;
  }
}
