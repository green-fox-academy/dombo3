package music;

public abstract class StringedInstrument extends Instrument {
  protected int numberOfStrings;
  final String formatForPlay = "%s, a %d-stringed instrument that %s\n";

  public StringedInstrument() {};

  public StringedInstrument(int numberOfStrings, String name, String voice) {
    super(name, voice);
    this.numberOfStrings = numberOfStrings;
  }

  public void play() {
   System.out.printf(formatForPlay,name,numberOfStrings,voice);
  }
}