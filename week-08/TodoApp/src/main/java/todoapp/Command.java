package todoapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public abstract class Command {
  private String flag;
  private String usageDescription;

  Command(String flag, String usageDescription) {
    this.flag = flag;
    this.usageDescription = usageDescription;
  }

  public abstract String execute(Todos myTodoList, String[] args);

  public String getFlag() {
    return flag;
  }

  public String getUsage() {
    return " -" + flag + "   " + usageDescription;
  }

}
