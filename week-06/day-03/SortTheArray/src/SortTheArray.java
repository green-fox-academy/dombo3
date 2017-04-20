import java.lang.reflect.Array;
import java.util.ArrayList;

public class SortTheArray {

  public static void main(String[] args) {
    Integer[] myArray = {1,2,3,4,5};
    sort(myArray);
  }

  public static <T extends Number> T[] sort(T[] array) {
    Double[] myArray = (Double[]) array;



    T[] again = (T[]) myArray;
    return again;
  }
}
