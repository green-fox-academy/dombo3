public class Counter {
  int value;
  int startValue;

  public Counter(){
    value = 0;
    startValue = 0;
  }

  public Counter(int value){
    this.value = value;
    startValue = value;
  }

  public void add(int number) {
    value += number;
  }

  public void add() {
    value += 1;
  }

  public int get(){
    return value;
  }

  public void reset() {
    value = startValue;
  }
}
