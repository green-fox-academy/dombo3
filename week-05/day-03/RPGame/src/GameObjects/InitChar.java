package GameObjects;

import java.util.ArrayList;
import java.util.List;

public class InitChar {
  private Hero hero;
  private Boss boss;
  private List<Skeleton> skeletons;
  private List<Character> characters;

  public InitChar(GameMap gameMap, int skeletons) {
    this.hero = new Hero(0,0,"assets/hero-down.png", gameMap);
    gameMap.getGameObjects().add(hero);
    this.boss = new Boss("assets/boss.png",gameMap);
    gameMap.getGameObjects().add(boss);
    this.skeletons = new ArrayList<>();
    for (int i = 0; i < skeletons; i++){
      this.skeletons.add(new Skeleton("assets/skeleton.png", gameMap));
      for (Skeleton skeleton : this.skeletons) {
        gameMap.getGameObjects().add(skeleton);
      }
    }

    this.characters = new ArrayList<>();
    characters.add(hero);
    characters.add(boss);
    for (Skeleton skeleton : this.skeletons) {
      characters.add(skeleton);
    }
  }

  public Hero getHero() {
    return hero;
  }

  public List<Character> getCharacters() {
    return characters;
  }
}