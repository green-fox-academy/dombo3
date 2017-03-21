/**
 * Created by user on 2017.03.21..
 */
public class Swap {
  public static void main(String[] args) {
    int a = 123;
    int b = 526;

    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    System.out.println("a: " + a);
    System.out.println("b: " + b);
  }
}
