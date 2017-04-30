package todoapp;

public class Todo {
  private String name;
  private boolean completed;

  public Todo(String name, boolean completed) {
    this.name = name;
    this.completed = completed;
  }

  public void complete() {
    this.completed = !this.completed;
  }

  public String getName() {
    return name;
  }

  public boolean isCompleted() {
    return completed;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }
}
