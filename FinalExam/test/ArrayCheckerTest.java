import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayCheckerTest {

  private ArrayChecker arrayChecker;
  private int[] a1;
  private int[] a2;

  @Before
  public void setup() throws Exception {
    arrayChecker = new ArrayChecker();
    a1 = new int[] {
        0, 1, 2, 3
    };

    a2 = new int[] {
        0, 1, 2, 3
    };
  }

  @Test
  public void isSameArrayTrue() throws Exception {
    assertTrue(arrayChecker.isSameArray(a1,a2));
  }

  @Test
  public void isSameArraySimpleTrue() throws Exception {
    assertTrue(arrayChecker.isSameArraySimple(a1,a2));
  }

  @Test
  public void isSameArrayFalse() throws Exception {
    setupForFalse();
    assertFalse(arrayChecker.isSameArray(a1,a2));
  }

  @Test
  public void isSameArraySimpleFalse() throws Exception {
    setupForFalse();
    assertFalse(arrayChecker.isSameArraySimple(a1,a2));
  }

  public void setupForFalse() {
    a2 = new int[] {
        0, 1, 2, 4
    };
  }

}