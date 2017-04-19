package creditcard;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardTest {
  CreditCard myCreditCard = new CreditCard();

  @Test
  public void getNameCardHolder() {
    String name = myCreditCard.getNameCardholder();
    assertEquals("ABC", name);
  }
}