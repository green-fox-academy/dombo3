package animals;

public class Reptile extends Animal implements WantChild {

  public Reptile(String name) {
    this.name = name;
  }


  @Override
  public String wantChild() {
    return "want child from and egg.";
  }
}
