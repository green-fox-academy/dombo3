import GameObjects.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameEngine extends JComponent implements KeyListener {
  private GameMap gameMap;
  private Hero hero;
  private Skeleton skeleton;
  private Skeleton skeleton2;
  private Skeleton skeleton3;

  public GameEngine() {
    this.gameMap = new GameMap();
    this.hero = new Hero(0,0,"assets/hero-down.png", gameMap);
    this.skeleton = new Skeleton("assets/skeleton.png", gameMap);
    this.skeleton2 = new Skeleton("assets/skeleton.png", gameMap);
    this.skeleton3 = new Skeleton("assets/skeleton.png", gameMap);

    gameMap.fillMap();
    gameMap.getGameObjects().add(hero);
    gameMap.getGameObjects().add(skeleton);
    gameMap.getGameObjects().add(skeleton2);
    gameMap.getGameObjects().add(skeleton3);
    gameMap.getCharacterList().add(hero);
    gameMap.getCharacterList().add(skeleton);
    gameMap.getCharacterList().add(skeleton2);
    gameMap.getCharacterList().add(skeleton3);

    setPreferredSize(new Dimension(720,720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
      for (GameObject o : gameMap.getGameObjects()) {
        PositionedImage image = new PositionedImage(o.getCostume(), o.getPosX(), o.getPosY());
        image.draw(graphics);
      }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("RPG Game");
    GameEngine gameEngine = new GameEngine();
    frame.add(gameEngine);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(gameEngine);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    int times = 2;
    int counter = 0;

    if (e.getKeyCode() == KeyEvent.VK_UP) {
      hero.moveUp();
      counter++;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.moveDown();
      counter++;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.moveRight();
      counter++;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.moveLeft();
      counter++;
    }

    if (counter == times) {
//      monster Move please
    }

    repaint();
  }
}