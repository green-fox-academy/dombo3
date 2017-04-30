package todoapp;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListCommandTest {
  @Test
  public void returnEmptyMessage() {
    String[] args = {};
    ListCommand command = new ListCommand();
    assertEquals("No todos for today! :)", command.execute(args));
  }

  @Test
  public void lFlag() {
    ListCommand command = new ListCommand();
    assertEquals("l", command.getFlag());
  }
}