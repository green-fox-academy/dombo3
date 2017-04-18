package animals;

public class Mammal extends Animal {

  public Mammal(String name) {
    this.name = name;
  }

  public String wantChild() {
    return "want child from my uterus.";
  }
}
