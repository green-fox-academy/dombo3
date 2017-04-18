package music;

public class StringedInstrument extends Instrument {
  protected int numberOfStrings;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";

  public StringedInstrument() {
  }

  public StringedInstrument(int myString) {
    this.numberOfStrings = myString;
  }

  @Override
  public void play() {
   System.out.printf(formatForPlay,name,numberOfStrings,voice);
  }
}