import GameObjects.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameEngine extends JComponent implements KeyListener {
  private GameMap gameMap;
  private InitChar players;

  public GameEngine() {
    this.gameMap = new GameMap();
    gameMap.fillMap();
    players = new InitChar(gameMap,3);
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
//    int times = 2;
//    int counter = 1;

    if (e.getKeyCode() == KeyEvent.VK_UP) {
      players.getHero().moveUp();
//      counter++;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      players.getHero().moveDown();
//      counter++;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      players.getHero().moveRight();
//      counter++;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      players.getHero().moveLeft();
//      counter++;
    }

//    if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() ==
//            KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT){
//      for (int i = 0; i < players.getMonsters().size(); i++) {
//          players.getMonsters().get(i).moveDown();
//        }
//    }

    repaint();
  }
}