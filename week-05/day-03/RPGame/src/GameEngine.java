import GameObjects.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class GameEngine extends JComponent implements KeyListener {
  private GameMap gameMap;
  private InitChar characters;
  private List<GameObject> gameObjects;


  public GameEngine() {
    gameMap = new GameMap();
    characters = new InitChar(gameMap,3);
    gameObjects = new ArrayList<>();

    gameMap.fillMap();
    gameObjects.addAll(gameMap.getGameFloor());
    gameObjects.addAll(characters.getCharacters());

    setPreferredSize(new Dimension(gameMap.getCol() * gameMap.getTILESIZE() + 120,gameMap.getRow
            () * gameMap.getTILESIZE()));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
      for (GameObject o : gameObjects) {
        PositionedImage image = new PositionedImage(o.getCostume(), o.getPosX(), o.getPosY());
        image.draw(graphics);
      }

    new HUD(graphics, gameMap, characters);
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
      characters.getHero().moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      characters.getHero().moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      characters.getHero().moveRight();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      characters.getHero().moveLeft();
    }

    repaint();
  }
}