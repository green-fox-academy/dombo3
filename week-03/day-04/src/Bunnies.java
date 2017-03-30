/**
 * Created by user on 2017.03.30..
 */
public class Bunnies {
  public static void main(String[] args) {
    System.out.println(bunnyEars(8));
  }

  public static int bunnyEars(int bunny) {
    if (bunny == 1) {
      return 2;
    } else {
      int result = 2 + bunnyEars(bunny - 1);
      return result;
    }
  }
}
