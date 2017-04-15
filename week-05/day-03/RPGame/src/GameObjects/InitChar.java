package GameObjects;

import java.util.ArrayList;
import java.util.List;

public class InitChar {
  private Hero hero;
  private Boss boss;
  private List<Skeleton> skeletons;
  private List<Character> characters;

  public InitChar(GameMap gameMap, int skeletons) {
    this.hero = new Hero("assets/hero-down.png", gameMap);
    this.boss = new Boss("assets/boss.png",gameMap);
    this.skeletons = new ArrayList<>();
    this.characters = new ArrayList<>();

    for (int i = 0; i < skeletons; i++){
      this.skeletons.add(new Skeleton("assets/skeleton.png", gameMap));
    }

    characters.add(hero);
    characters.add(boss);
    for (Skeleton skeleton : this.skeletons) {
      characters.add(skeleton);
    }

  }

  public Hero getHero() {
    return hero;
  }

  public Boss getBoss() {
    return boss;
  }

  public List<Skeleton> getSkeletons() {
    return skeletons;
  }

  public List<Character> getCharacters() {
    return characters;
  }
}