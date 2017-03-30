/**
 * Created by user on 2017.03.30..
 */
public class Factorial {
  public static void main(String[] args) {
    System.out.println(factorial_recursive(5));
    System.out.println(factorial_loop(5));
  }

  public static int factorial_loop(int n) {
    int factorial = 1;
    for(int i = 1; i < n + 1; i++) {
      factorial *= i;
    }
    return factorial;
  }

  public static int factorial_recursive(int n) {
    if(n == 1){
      return 1;
    }
    else{
      return n * factorial_recursive(n - 1);
    }
  }
}
