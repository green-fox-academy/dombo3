package GameObjects;

import java.util.ArrayList;
import java.util.List;

public class InitChar {
  private Hero hero;
  private Boss boss;
  private List<Skeleton> skeletons;
  private List<Monster> monsters;
  private List<Character> characters;

  public InitChar(GameMap gameMap, int skeletons) {
    this.skeletons = new ArrayList<>();
    this.monsters = new ArrayList<>();
    this.characters = new ArrayList<>();

    // create game characters
    this.hero = new Hero("assets/hero-down.png", gameMap);
    this.boss = new Boss("assets/boss.png",gameMap);
    for (int i = 0; i < skeletons; i++){
      this.skeletons.add(new Skeleton("assets/skeleton.png", gameMap));
    }

    characters.add(hero);
    characters.add(boss);
    characters.addAll(this.skeletons);

    monsters.add(boss);
    monsters.addAll(this.skeletons);

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

  public List<Monster> getMonsters() {
    return monsters;
  }

  public List<Character> getCharacters() {
    return characters;
  }
}