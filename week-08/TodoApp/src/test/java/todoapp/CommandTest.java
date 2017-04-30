package todoapp;

import org.junit.Test;

import static org.junit.Assert.*;

class ChildCommand extends Command {
  ChildCommand() {
    super("w", "Test");
  }

  @Override
  public String execute(String[] args) {
    return "";
  }
}


public class CommandTest {

  @Test
  public void getFlag() {
    ChildCommand command = new ChildCommand();
    assertEquals("w", command.getFlag());
  }

  @Test
  public void getUsage() {
    ChildCommand command = new ChildCommand();
    assertEquals(" -w   Test", command.getUsage());
  }
}
