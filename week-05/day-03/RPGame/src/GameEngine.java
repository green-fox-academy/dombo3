import GameObjects.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class GameEngine extends JComponent implements KeyListener {
  private GameMap gameMap;
  private InitChar players;
  private List<GameObject> gameObjects;


  public GameEngine() {
    this.gameMap = new GameMap();
    gameMap.fillMap();
    this.players = new InitChar(gameMap,3);
    this.gameObjects = new ArrayList<>();
    gameObjects.addAll(gameMap.getGameFloor());
    gameObjects.addAll(players.getCharacters());
    setPreferredSize(new Dimension(720,720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
      for (GameObject o : gameObjects) {
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

    if (e.getKeyCode() == KeyEvent.VK_UP) {
      players.getHero().moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      players.getHero().moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      players.getHero().moveRight();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      players.getHero().moveLeft();
    }

    repaint();
  }
}