package GameObjects;

import java.util.ArrayList;
import java.util.List;

public class InitChar {
  private Hero hero;
  private List<Skeleton> skeletons;

  public InitChar(GameMap gameMap, int skeletons) {
    this.hero = new Hero(0,0,"assets/hero-down.png", gameMap);
    gameMap.getGameObjects().add(hero);
    gameMap.getCharacterList().add(hero);

    this.skeletons = new ArrayList<>();
    for (int i = 0; i < skeletons; i++){
      this.skeletons.add(new Skeleton("assets/skeleton.png", gameMap));
      for (Skeleton skeleton : this.skeletons) {
        gameMap.getGameObjects().add(skeleton);
        gameMap.getCharacterList().add(skeleton);
      }
    }
  }

  public Hero getHero() {
    return hero;
  }

  public List<Skeleton> getSkeletons() {
    return skeletons;
  }
}