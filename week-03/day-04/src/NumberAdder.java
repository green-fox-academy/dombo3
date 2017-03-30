/**
 * Created by user on 2017.03.30..
 */
public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(addNum(4));
  }

  public static int addNum(int n) {
    if (n == 1) {
      return 1;
    } else {
      int result = n + addNum(n - 1);
      return result;
    }
  }
}
