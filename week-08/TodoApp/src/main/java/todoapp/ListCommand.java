package todoapp;

public class ListCommand extends Command {
  ListCommand() {
    super("l", "Lists all the tasks");
  }

  public String execute(Todos myTodoList, String[] args) {
    String todos = myTodoList.getTodos().isEmpty() ? "No todos for today! :)" : myTodoList.toString();

    return todos;
  }
}
