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

  public Todo(String name) {
    this.name = name;
    this.completed = false;
    this.ID = ++counter;
    this.createdAt = LocalDate.now();
  }

  public Todo(String name, boolean completed) {
    this.name = name;
    this.completed = completed;
    this.ID = ++counter;
    this.createdAt = LocalDate.now();
  }

  public Todo(String name, boolean completed, int ID) {
    this.name = name;
    this.completed = completed;
    this.ID = ID;
    this.createdAt = LocalDate.now();
  }

  public void isItComplete() {
    if (completedAt != null && completedAt.isBefore(LocalDate.now())) {
     this.completed = true;
    }
    //    this.completed = !this.completed;
  }

  public int competionTime() {
    LocalDate now = LocalDate.now();
    return deadline.getDayOfYear() - now.getDayOfYear();
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getID() {
    return ID;
  }

  public boolean isCompleted() {
    return completed;
  }

  public static void setCounter(int counter) {
    Todo.counter = counter;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

}
