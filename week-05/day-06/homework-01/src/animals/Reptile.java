package animals;

public class Reptile extends Animal {

  public Reptile(String name) {
    this.name = name;
  }

  @Override
  public void greet() {

  }

  @Override
  public String wantChild() {
    return "want child from and egg.";
  }

  @Override
  public void eat() {

  }

  @Override
  public boolean sleep() {
    return false;
  }
}
