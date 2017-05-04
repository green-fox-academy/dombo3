package com.greenfoxacademy.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class FoxTest {
  @Test
  public void createEmptyFox() {
    Fox fox = new Fox();
    assertNotNull(fox);
  }

  @Test
  public void createGreenFox() {
    Fox fox = new Fox("Mr.Fox","pizza","lemonade");
    assertEquals("pizza", fox.getFood());
  }

  @Test
  public void getFoxTrick() {
    Fox fox = new Fox("Mr.Fox","pizza","lemonade");
    fox.addTrick("hop on corpses");
    assertEquals("hop on corpses", fox.getTricklist().get(0));
  }

  @Test
  public void checkTrickListSize() {
    Fox fox = new Fox("Mr.Fox","pizza","lemonade");
    fox.addTrick("hop on corpses");
    assertEquals(1, fox.getTricklist().size());
  }
}