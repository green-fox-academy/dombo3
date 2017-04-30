package todoapp;

public class CompleteCommand extends Command {
  CompleteCommand() {
    super("c", "Completes an task");
  }

  @Override
  public String execute(Todos myTodoList, String[] args) {
    Todo task = myTodoList.getTodos().get(Integer.parseInt(args[1])-1);
    task.complete();
    if (task.isCompleted()) {
      return "\"" + task.getName() + "\" " + "marked as completed";
    } else {
      return "\"" + task.getName() + "\" " + "unmarked as completed";
    }
  }
}
