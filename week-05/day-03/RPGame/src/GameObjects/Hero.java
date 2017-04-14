package GameObjects;

public class Hero extends Character {

  public Hero(String costume, GameMap map) {
    super(costume, map);
    Dice myDice = new Dice();
    this.HP = 20 + 3 * myDice.roll();
    this.DP = 2 * myDice.roll();
    this.SP = 5 + myDice.roll();
    this.setPosX(0);
    this.setPosY(0);
  }

  @Override
  public void moveUp() {
    super.moveUp();
    setCostume("assets/hero-up.png");
  }

  @Override
  public void moveDown() {
    super.moveDown();
    setCostume("assets/hero-down.png");
  }

  @Override
  public void moveRight() {
    super.moveRight();
    setCostume("assets/hero-right.png");
  }

  @Override
  public void moveLeft() {
    super.moveLeft();
    setCostume("assets/hero-left.png");
  }
}