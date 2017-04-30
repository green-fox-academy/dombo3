package todoapp;

import java.util.List;

public class AddCommand extends Command{
  AddCommand() {
    super("a", "Adds a new task");
  }

  @Override
  public String execute(Todos myTodoList, String[] args) {
    myTodoList.add(new Todo(args[1]));
    return "\"" + args[1] + "\" " + "task is added";
  }
}
