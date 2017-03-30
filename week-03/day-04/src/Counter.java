/**
 * Created by user on 2017.03.30..
 */
public class Counter {
  public static void main(String[] args) {
    countDown(8);
  }

  public static void countDown(int n) {
    if (n == 0) {
      System.out.println(n);
    } else {
      System.out.println(n);
      countDown(n-1);
    }
  }
}
