package todoapp;

import java.util.ArrayList;
import java.util.List;

public class Todos {
  private List<Todo> todos;

  public Todos(){
    this.todos = new ArrayList<>();
  }

  public void add(Todo todo) {
    todos.add(todo);
  }

  public void remove(Todo todo) {
    todos.remove(todo);
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public List<String> createStringList() {
    List<String> lines = new ArrayList<>();
    for (int i = 0; i < todos.size(); i++) {
      int isCompleted = (todos.get(i).isCompleted()) ? 1 : 0;
      lines.add(todos.get(i).getName() + ";" +  isCompleted);
    }
    return lines;
  }

  @Override
  public String toString(){
    String result = "";
    for (int i = 0; i < todos.size(); i++) {
      result += (i + 1) + " - " + todos.get(i) + "\n";
    }
    return result;
  }

  public String list(){
    String result = "";
    for (int i = 0; i < todos.size(); i++) {
      result += (i + 1) + " - " + todos.get(i).getName() + "\n";
    }
    return result;
  }
}
