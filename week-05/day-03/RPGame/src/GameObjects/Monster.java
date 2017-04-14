package GameObjects;

public class Monster extends Character {
  public Monster() {
  }

  public Monster(String costume, GameMap map) {
    super(costume, map);
    int[] coordinate = map.getRandomCoordinate();
    this.setPosY(coordinate[0]);
    this.setPosX(coordinate[1]);
    Dice myDice = new Dice();
    this.HP = 2 * map.gameLevel * myDice.roll();
    this.DP = map.gameLevel / 2 * myDice.roll();
    this.SP = map.gameLevel * myDice.roll();
  }
}