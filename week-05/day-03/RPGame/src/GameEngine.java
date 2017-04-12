import GameObjects.GameObject;
import GameObjects.PositionedImage;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static com.sun.glass.ui.Cursor.setVisible;

public class GameEngine extends JComponent {
  private Map map;

  public GameEngine() {
    this.map = new Map();
    setPreferredSize(new Dimension(720,720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    map.fillMap();
    for (List<GameObject> list : map.getGameObjects()) {
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
//    frame.addKeyListener();
  }
}
