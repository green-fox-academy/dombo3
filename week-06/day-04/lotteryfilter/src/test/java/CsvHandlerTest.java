import static org.junit.Assert.*;

import org.junit.Test;

public class CsvHandlerTest {

  CsvHandler myHandler = new CsvHandler();

  @Test
  public void readFile() throws Exception {
    myHandler.readFile();
    assertNotNull(myHandler.getLines());
  }

  @Test
  public void readFile_firstLine() throws Exception {
    myHandler.readFile();
    String[] firstline = (String[]) myHandler.getLines().get(0);
    assertEquals("2015", firstline[0]);
  }

  @Test
  public void search() throws Exception {
   assertTrue(myHandler.search("2015"));
  }
}