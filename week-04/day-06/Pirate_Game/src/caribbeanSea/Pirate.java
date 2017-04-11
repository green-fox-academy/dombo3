package caribbeanSea;

public class Pirate {
  private int rumLevel;
  private boolean alive;

  public Pirate() {
    alive = true;
    rumLevel = 0;
  }

  public void drinkSomeRum() {
    rumLevel++;
  }

  public void howItGoingMate() {
    if (rumLevel < 5) {
      System.out.println("Pour me anudder!");
    } else {
      setRumLevel(0);
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }
  }

  public void die() {
    alive = false;
  }

  public void brawl() {

  }

  public void addParrot() {

  }

  public int getRumLevel() {
    return rumLevel;
  }

  public boolean isAlive() {
    return alive;
  }

  public void setRumLevel(int rumLevel) {
    this.rumLevel = rumLevel;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }
}

// int add = MAX_Ammo - givenAmmo