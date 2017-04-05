import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  Anagram myAnagram = new Anagram();

  @Test
  public void isAnagram() throws Exception {
    assertTrue(myAnagram.isAnagram("William", "illiamW"));
  }
}