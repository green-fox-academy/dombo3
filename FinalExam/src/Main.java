public class Main {

  public static void main(String[] args) {
    ArrayChecker arrayChecker = new ArrayChecker();

    int a1[] = new int[] {
        0, 1, 2, 3
    };

    int a2[] = new int[] {
      0, 1, 2, 3
    };

    System.out.println(arrayChecker.isSameArray(a1, a2));
    System.out.println(arrayChecker.isSameArraySimple(a1, a2));
  }
}
