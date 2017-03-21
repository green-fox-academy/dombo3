/**
 * Created by user on 2017.03.21..
 */
public class Bmi {
  public static void main(String[] args) {
    double massInKg = 73.7;
    double heightInM = 1.78;
    double BMI;

    BMI = massInKg/(heightInM*heightInM);
    System.out.println(BMI);

  }
}
