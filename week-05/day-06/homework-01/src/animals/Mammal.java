package animals;

public class Mammal extends Animal {

  public Mammal(String name) {
    this.name = name;
  }

  @Override
  public void greet() {

  }

  @Override
  public String wantChild() {
    return "want child from my uterus.";
  }

  @Override
  public void eat() {

  }

  @Override
  public boolean sleep() {
    return false;
  }
}
