import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

  Sum sum = new Sum();

  @Test
  public void testSumActualNumber() throws Exception {
    List<Integer> numList = new ArrayList<Integer>(Arrays.asList(3,4,5,6,7));
    int result = sum.sum(numList);
    assertEquals(result, 25);
  }

  @Test
  public void testSumEmpty() throws Exception {
    List<Integer> numList = new ArrayList<Integer>();
    int result = sum.sum(numList);
    assertEquals(result, 0);
  }

  @Test
  public void testSumOne() throws Exception {
    List<Integer> numList = new ArrayList<>(Arrays.asList(2));
    assertEquals(sum.sum(numList),2);
  }
}