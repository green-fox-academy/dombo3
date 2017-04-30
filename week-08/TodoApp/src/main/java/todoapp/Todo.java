package todoapp;

import java.time.LocalDate;

public class Todo {
  private String name;
  private boolean completed;
  private static int counter = 0;
  private final int ID;
  private LocalDate createdAt;
  private LocalDate completedAt;
  private LocalDate deadline;

  public Todo(String name, boolean completed) {
    this.name = name;
    this.completed = completed;
    this.ID = ++counter;
    this.createdAt = LocalDate.now();
  }

  public void complete() {
    this.completed = !this.completed;
  }

  public int competionTime() {
    LocalDate now = LocalDate.now();
    return deadline.getDayOfYear() - now.getDayOfYear();
  }

  public String getName() {
    return name;
  }

  public int getID() {
    return ID;
  }

  public boolean isCompleted() {
    return completed;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

}
