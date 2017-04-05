import org.junit.Test;

import static org.junit.Assert.*;


public class AnimalTest {

  Animal animal = new Animal();

  @Test
  public void isAnimal() {
    assertTrue(animal instanceof Animal);
  }

  @Test
  public void eatOne() {
    animal.eat();
    assertEquals(animal.getHunger(), 49);
  }

  @Test
  public void drinkOne() {
    animal.drink();
    assertEquals(animal.getThirst(), 49);
  }

  @Test
  public void playOne() {
    animal.play();
    assertEquals(animal.getThirst(), 51);
    assertEquals(animal.getHunger(), 51);
  }
}