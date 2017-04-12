import GameObjects.GameMap;
import GameObjects.GameObject;
import GameObjects.Hero;
import GameObjects.PositionedImage;
import GameObjects.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class GameEngine extends JComponent implements KeyListener {
  private GameMap gameMap;
  private Hero hero;

  public GameEngine() {
    this.gameMap = new GameMap();
    setPreferredSize(new Dimension(720,720));
    setVisible(true);
    hero = new Hero(0,0,"assets/hero-down.png");
    gameMap.fillMap();
    List<GameObject> heroList = new ArrayList<>();
    heroList.add(hero);
    gameMap.getGameObjects().add(heroList);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    for (List<GameObject> list : gameMap.getGameObjects()) {
      for (GameObject o : list) {
        PositionedImage image = new PositionedImage(o.getCostume(), o.getPosX(), o.getPosY());
        image.draw(graphics);
      }
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

    if (e.getKeyCode() == KeyEvent.VK_UP) {
      hero.moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero.moveRight();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero.moveLeft();
    }
    repaint();
  }
}
