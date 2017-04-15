package animals;

public abstract class Animal {
  protected String name;
  protected int age;
  protected String gender;

  public abstract void greet();
  public abstract String wantChild();
  public abstract void eat();
  public abstract boolean sleep();

  public String getName() {
    return name;
  }
}
