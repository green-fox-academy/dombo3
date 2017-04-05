import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void sum() throws Exception {
    Sum sum = new Sum();
    List<Integer> numList = new ArrayList<Integer>(Arrays.asList(3,4,5,6,7));
    int result = sum.sum(numList);
    assertEquals(result, 25);
  }

}