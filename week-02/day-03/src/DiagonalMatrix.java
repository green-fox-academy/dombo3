/**
 * Created by user on 2017.03.22..
 */
public class DiagonalMatrix {
  public static void main(String[] args) {
    String[][] matrix = new String[4][4];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++){
        if (i == j) {
          matrix[i][j] = "1";
        } else {
          matrix[i][j] = "0";
        }
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
