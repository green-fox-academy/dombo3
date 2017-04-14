package GameObjects;

public class Boss extends Monster {
  public Boss(String costume, GameMap map) {
    super(costume, map);
    Dice myDice = new Dice();
    this.HP += myDice.roll();
    this.DP += myDice.roll()/2;
    this.SP += map.gameLevel;
  }
}