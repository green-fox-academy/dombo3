import java.util.ArrayList;

public class Sum {
  
  public Sum() {
  }

  public int sum(ArrayList<Integer> nums) {
    int result = 0;
    for(int num : nums) {
      result += num;
    }
    return result;
  }
}
