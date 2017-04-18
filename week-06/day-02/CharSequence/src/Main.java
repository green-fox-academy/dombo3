public class Main {
  public static void main(String[] args) {
    CharOperations myCharOperations = new CharOperations("hello");
    System.out.println(myCharOperations.length());
    System.out.println(myCharOperations.charAt(2));
    System.out.println(myCharOperations.subSequence(0,3));
    System.out.println(myCharOperations.toString());
  }
}
