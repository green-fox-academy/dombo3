
public class Account {
  int a;
  int b;

  public void setData(int c, int d){
    a = c;
    b = d;
  }

  public void showData(){
    System.out.println(a);
    System.out.println(b);
  }

  public static void main(String[] args) {
    Account obj = new Account();
    obj.setData(3,4);
    obj.showData();
    Account obj2 = new Account();
    obj2.setData(5,6);
    obj2.showData();
  }
}
