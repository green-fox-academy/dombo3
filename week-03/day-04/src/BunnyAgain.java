/**
 * Created by user on 2017.03.30..
 */
public class BunnyAgain {
  public static void main(String[] args) {
    System.out.println(bunnyEars(4));
  }

  public static int bunnyEars(int bunny) {
    if (bunny == 1) {
      return 3;
    } else {
      int earnum;
      if (bunny % 2 == 0){
        earnum = 2;
      } else {
        earnum = 3;
      }
      int result = earnum + bunnyEars(bunny - 1);
      return result;
    }
  }
}
