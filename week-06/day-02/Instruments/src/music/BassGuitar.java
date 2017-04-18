package music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    this.numberOfStrings = 4;
    this.name = "BassGuitar";
    this.voice = "Duum-duum-duum";
  }

  public BassGuitar(int myStrings) {
    this.numberOfStrings = myStrings;
    this.name = "BassGuitar";
    this.voice = "Duum-duum-duum";
  }
}
