/**
 * Created by user on 2017.04.01..
 */
public class Earth {
  public static void main(String[] args) {
    HUman tom = new HUman();
    System.out.println(tom.getClass());
    tom.age = 27;
    tom.speak();
    HUman pete = new HUman();
    pete.age = 23;
    pete.speak();
  }
}
