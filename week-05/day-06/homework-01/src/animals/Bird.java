package animals;

public class Bird extends Animal {

  public Bird(String name) {
    this.name = name;
  }

  @Override
  public void greet() {
  }

  @Override
  public String wantChild() {
    return "want child from an egg.";
  }

  @Override
  public void eat() {

  }

  @Override
  public boolean sleep() {
    return false;
  }
}
