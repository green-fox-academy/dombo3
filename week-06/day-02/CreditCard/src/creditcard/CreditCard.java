package creditcard;

import java.util.Random;

public class CreditCard implements CreditCardy {
  protected String name;
  protected int counter;

  @Override
  public int getSumCVV() {
    return 0;
  }

  @Override
  public String getNameCardholder() {
    String letters = "";
    int n = 'Z' - 'A' + 1;
    for (int i = 0; i < 3; i++) {
      char c = (char) ('A' + Math.random() * n);
      letters += c;
    }

    String digits = "";
    int m = '9' - '0' + 1;
    for (int i = 0; i < 1; i++) {
      char c = (char) ('0' + Math.random() * m);
      digits += c;
    }

    return letters + digits;
  }

  @Override
  public String getCodeAccount() {
    String code = "";
    final String alphabet = "0123456789";
    final int N = alphabet.length();
    Random r = new Random();
    for (int i = 0; i < 16; i++) {
      code += alphabet.charAt(r.nextInt(N));
    }
    return code;
  }

  @Override
  public int cumeSumCVV(String codeAccount) {
    return 0;
  }

  @Override
  public String toString() {
    return String.format("Name=%s CC#=%s CVV=%d", getNameCardholder(),getCodeAccount(),
            getSumCVV());
  }
}
