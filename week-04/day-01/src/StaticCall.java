/**
 * Created by user on 2017.04.02..
 */
public class StaticCall {
  public static void main(String[] args) {
    Static hello = new Static();
    Static.DoSomething("Hello");
    hello.DoSomethingElse("Hello");
    Static.age = 4;
    hello.age = 3;
  }
}
