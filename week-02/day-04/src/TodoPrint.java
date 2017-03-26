/**
 * Created by user on 2017.03.26..
 */
public class TodoPrint {
  public static void main(String[] args) {
    String todoText = " - Buy milk\n";
    todoText = "My todo: \n" + todoText;
    todoText += " - Download games\n";
    todoText += "    - Diablo\n";

    System.out.println(todoText);
  }
}
