package todoapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TodoTest {
  @Test
  public void checkID() throws Exception {
    Todo first = new Todo("Clean the room",false);
    Todo second = new Todo("Washing", false);
    Todo third = new Todo("Washing", false);
    assertEquals(1,first.getID());
    assertEquals(2,second.getID());
    assertEquals(3,third.getID());
  }
}