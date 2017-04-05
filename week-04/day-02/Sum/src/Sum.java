import java.util.ArrayList;
import java.util.List;

public class Sum {

  public Sum() {
  }

  public int sum(List<Integer> nums) {
    int result = 0;
    if (!(nums == null)) {
      for(int num : nums) {
        result += num;
      }
    }
    return result;
  }
}
