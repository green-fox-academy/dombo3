package todoapp;

public class RemoveCommand extends Command {
  RemoveCommand() {
    super("r", "Removes an task");
  }

  @Override
  public String execute(Todos myTodoList, String[] args) {
    String task = myTodoList.getTodos().get(Integer.parseInt(args[1])-1).getName();
    myTodoList.remove(myTodoList.getTodos().get(Integer.parseInt(args[1])-1));
    return  "\"" + task + "\"" + " task removed from list";
  }
}
