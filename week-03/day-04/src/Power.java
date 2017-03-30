/**
 * Created by user on 2017.03.30..
 */
public class Power {
  public static void main(String[] args) {
    System.out.println(power(2,4));
  }
  public static int power(int base, int n) {
    if (n == 1) {
      return base;
    } else {
      int result = base * power(base,n-1);
      return result;
    }
  }
}
