import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class ExtensionTest {

  Extension extension = new Extension();

  @Test
  void testAdd_2and3is5() {
    assertEquals(5, extension.add(2, 3));
  }

  @Test
  void testAdd_1and4is5() {
    assertEquals(5, extension.add(1, 4));
  }

  @Test
  public void testAdd_3and5() {
    assertEquals(8, extension.add(3,5));
  }

  @Test
  void testMaxOfThree_first() {
    assertEquals(5, extension.maxOfThree(5, 4, 3));
  }

  @Test
  void testMaxOfThree_third() {
    assertEquals(5, extension.maxOfThree(3, 4, 5));
  }

  @Test
  public void testMaxOfThree_second() {assertEquals(40,extension.maxOfThree(4, 40, 30));}

  @Test
  void testMedian_four() {
    assertEquals(5 , extension.median(Arrays.asList(7,5,3,5)) , 0.1);
  }

  @Test
  void testMedian_five() {
    assertEquals(3 , extension.median(Arrays.asList(1,2,3,4,5)), 0.1);
  }

  @Test
  public void testMedian_ten() {
    assertEquals(7.5 ,extension.median(Arrays.asList(7,10,9,3,8,5,4,8)), 0.1);
  }

  @Test
  void testIsVowel_a() {
    assertTrue(extension.isVowel('a'));
  }

  @Test
  void testIsVowel_u() {
    assertTrue(extension.isVowel('u'));
  }

  @Test
  public void testIsVowel_e() {
    assertTrue(extension.isVowel('e'));
  }

  @Test
  void testTranslate_bemutatkozik() {
    assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
  }

  @Test
  void testTranslate_kolbice() {
    assertEquals("lavagovopuvus", extension.translate("lagopus"));
  }

  @Test
  void testTranslate_kerestem() { assertEquals("keverevestevem",extension.translate("kerestem"));}

}

