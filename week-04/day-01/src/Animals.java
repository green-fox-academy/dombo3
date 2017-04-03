
public class Animals {
  public static void main(String[] args) {
    Animal Leo = new Animal();
    System.out.println(Leo.hunger);
    System.out.println(Leo.thirst);

    Leo.play();
    System.out.println(Leo.hunger);
    System.out.println(Leo.thirst);
    Leo.eat();
    Leo.drink();
    System.out.println(Leo.hunger);
    System.out.println(Leo.thirst);
  }
}
