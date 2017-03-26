/**
 * Created by user on 2017.03.26..
 */

public class reverse {
  public static void main(String[] args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem" +
            " eht fI";

    String original = reverser(reversed);
    System.out.println(original);
  }

  public static String reverser(String text) {

    for (int i = text.length() - 1; i >= 0; i--){
      System.out.println(text.charAt(i));
    }

    return "HelloWorld";
  }
}
