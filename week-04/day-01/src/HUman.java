public class HUman {
  int age;
  int legs;
  boolean hair;

  public HUman(){
    this.legs = 2;
    this.hair = true;
  }

  public void speak(){
    System.out.println(age);
    System.out.println(legs);
    System.out.println(hair);
  }

  public void eat(){
    System.out.println("Eat");
  }

  public void walk(){
    System.out.println("Walk");
  }
}
