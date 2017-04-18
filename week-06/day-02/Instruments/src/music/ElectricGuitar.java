package music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    this.numberOfStrings = 6;
    this.name = "ElectricGuitar";
    this.voice = "Twang";
  }

  public ElectricGuitar(int string) {
    super(string);
    this.name = "ElectricGuitar";
    this.voice = "Twang";
  }
}
