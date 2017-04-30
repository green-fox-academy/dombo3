package todoapp;

public class UpdateCommand extends Command {

  UpdateCommand() {
    super("u", "Update task description");
  }

  @Override
  public String execute(Todos myTodoList, String[] args) {
    for (Todo todo : myTodoList.getTodos()) {
     if (todo.getID() == Integer.parseInt(args[1])) {
       todo.setName(args[2]);
     }
    }
    return "";
  }
}
