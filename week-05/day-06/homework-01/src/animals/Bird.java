package animals;

public class Bird extends Animal implements WantChild {

  public Bird(String name) {
    this.name = name;
  }

  @Override
  public String wantChild() {
    return "want child from an egg.";
  }
}
