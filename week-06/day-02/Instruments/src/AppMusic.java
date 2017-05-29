import mailcheck.Employee;
import mailcheck.Salary;
import music.BassGuitar;
import music.ElectricGuitar;
import music.Violin;

public class AppMusic {
  public static void main(String[] args) {

    System.out.println("Test 1, create Electric Guitar, Bass Guitar and Violin with default strings.");
    ElectricGuitar guitar = new ElectricGuitar();
    BassGuitar bassGuitar = new BassGuitar();
    Violin violin = new Violin();

    System.out.println("Test 1 Play");
    guitar.play();
    bassGuitar.play();
    violin.play();

    System.out.println("Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings .");
    ElectricGuitar guitar2 = new ElectricGuitar(7,"Electric Guitar", "Twang");
    BassGuitar bassGuitar2 = new BassGuitar(5);

    System.out.println("Test 2 Play");
    guitar2.play();
    bassGuitar2.play();

//    Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
//    Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
//    System.out.println("Call mailCheck using Salary reference --");
//    s.mailCheck();
//    System.out.println("\n Call mailCheck using Employee reference--");
//    e.mailCheck();
//    e.myabstractMethod();
  }
}
