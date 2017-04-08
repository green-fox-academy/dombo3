public class DrawChessTable {
  public static void main(String[] args) {
    for (int k = 0; k < 8; k++) {
      for (int i = 0; i < 4; i++) {
        System.out.print(((k % 2 == 0) ? "% " : " %"));
      }
      System.out.println();
    }
  }
}
