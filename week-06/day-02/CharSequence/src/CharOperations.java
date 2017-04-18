import java.util.ArrayList;
import java.util.List;

public class CharOperations implements CharSequence {
  public String testString;

  public CharOperations(String testString) {
    this.testString = testString;
  }

  @Override
  public int length() {
    return testString.length();
  }

  @Override
  public char charAt(int index) {
    return testString.charAt(testString.length() - index - 1);
  }

  @Override
  public java.lang.CharSequence subSequence(int start, int end) {
    List<Character> reversed = new ArrayList<>();
    for (int i = start; i < end; i++) {
      reversed.add(testString.charAt(testString.length() - i - 1));
    }
    StringBuilder builder = new StringBuilder(reversed.size());
    for (Character ch : reversed) {
      builder.append(ch);
    }
    return builder.toString();
  }

  @Override
  public String toString() {
   return (String) this.subSequence(0,testString.length());
  }
}
