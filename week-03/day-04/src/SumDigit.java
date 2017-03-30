/**
 * Created by user on 2017.03.30..
 */
public class SumDigit {
  public static void main(String[] args) {
    System.out.println(summaDigits(126));
  }
  public static int summaDigits(int n) {
    if (n == 0) {
      return 0;
    } else {
      int num = n % 10 + summaDigits(n/10);
      return num;
    }
  }
}
