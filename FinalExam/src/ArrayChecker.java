import java.util.Arrays;

public class ArrayChecker {

  public boolean isSameArray(int[] a1, int[] a2) {
    if (a1==a2) {
      return true;
    }

    if (a1==null || a2==null) {
      return false;
    }

    int length = a1.length;
    if (a2.length != length) {
      return false;
    }

    for (int i=0; i<length; i++) {
      if (a1[i] != a2[i])
        return false;
    }
    return true;
  }

  public boolean isSameArraySimple(int[] a1, int[] a2) {
    return Arrays.equals(a1,a2);
  }
}
