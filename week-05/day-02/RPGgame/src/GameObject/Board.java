package GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Array;

public class Board extends JComponent implements KeyListener {

  int HeroX;
  int HeroY;
  int HeroDirection;

  public Board() {

    HeroX = 0;
    HeroY = 0;

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

    int[][] gameBoard = new int[][]{
            { 1, 1, 1, 0, 1, 0, 1, 1, 1, 1 },
            { 1, 1, 1, 0, 1, 0, 1, 0, 0, 1 },
            { 1, 0, 0, 0, 1, 0, 1, 0, 0, 1 },
            { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 },
            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
            { 1, 0, 1, 0, 1, 1, 1, 1, 0, 1 },
            { 1, 0, 1, 0, 1, 0, 0, 1, 0, 1 },
            { 1, 1, 1, 1, 1, 0, 0, 1, 0, 1 },
            { 1, 0, 0, 0, 1, 1, 1, 1, 0, 1 },
            { 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
    };

    int row = gameBoard.length;
    int col = gameBoard[0].length;



    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (gameBoard[i][j] == 1) {
          PositionedImage floor = new PositionedImage("assets/floor.png", i * 72, j * 72);
          floor.draw(graphics);
        } else if (gameBoard[i][j] == 0) {
          PositionedImage wall = new PositionedImage("assets/wall.png",i * 72, j * 72);
          wall.draw(graphics);
        }
      }
    }

    if (HeroDirection == 0) {
      PositionedImage hero = new PositionedImage("assets/hero-down.png",HeroX,HeroY);
      hero.draw(graphics);
    }

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
      HeroDirection = 0;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      HeroY += 72;
      HeroDirection = 1;
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      HeroX += 72;
      HeroDirection = 2;
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      HeroX -= 72;
      HeroDirection = 3;
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}