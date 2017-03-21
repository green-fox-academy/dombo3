/**
 * Created by user on 2017.03.21..
 */
public class Cuboid {
  public static void main(String[] args) {
    double l = 2;
    double w = 3;
    double h = 4;
    double TSA;
    double Volume;

    TSA = 2*(l*w+w*h+h*l);
    Volume = l*w*h;

    System.out.println("Total Surface Area: " + (int) TSA);
    System.out.println("Volume: " + (int) Volume);
  }
}
