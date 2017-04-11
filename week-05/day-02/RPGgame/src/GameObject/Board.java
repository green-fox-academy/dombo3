package GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  int HeroX;
  int HeroY;

  public Board() {

    HeroX = 300;
    HeroY = 300;

    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  public static void BoardMain() {
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();

    frame.addKeyListener(board);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    PositionedImage floor = new PositionedImage("assets/floor.png", 300, 300);
    floor.draw(graphics);
    PositionedImage hero = new PositionedImage("assets/hero-down.png",HeroX,HeroY);
    hero.draw(graphics);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      HeroY -= 72;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      HeroY += 72;
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      HeroX += 72;
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      HeroX -= 72;
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}