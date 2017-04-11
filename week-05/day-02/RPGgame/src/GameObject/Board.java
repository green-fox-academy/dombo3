package GameObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  int HeroX;
  int HeroY;
  int HeroDirection;
  final int TILESIZE = 72;
  final int SIZEX = 10;
  final int SIZEY = 10;
  final int BOARDDIMENSIONX = TILESIZE * SIZEX;
  final int BOARDIMENSIONY = TILESIZE * SIZEY;


  public Board() {
    HeroX = 0;
    HeroY = 0;
    setPreferredSize(new Dimension(BOARDDIMENSIONX, BOARDIMENSIONY));
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
    int[][] gameBoard = new int[][] {
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

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (gameBoard[i][j] == 1) {
          PositionedImage floor = new PositionedImage("assets/floor.png", i * TILESIZE, j *
                  TILESIZE);
          floor.draw(graphics);
        } else if (gameBoard[i][j] == 0) {
          PositionedImage wall = new PositionedImage("assets/wall.png",i * TILESIZE, j * TILESIZE);
          wall.draw(graphics);
        }
      }
    }

    String heroFile;
    switch (HeroDirection) {
      case 0: heroFile = "assets/hero-up.png";
      break;
      case 1: heroFile = "assets/hero-left.png";;
      break;
      case 2: heroFile = "assets/hero-down.png";;
      break;
      case 3: heroFile = "assets/hero-right.png";;
      break;
      default: heroFile = "assets/hero-down.png";
    }
    PositionedImage hero = new PositionedImage(heroFile,HeroX,HeroY);
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
      if ((HeroY - 72) >= 0) {
        HeroY -= 72;
      }
      HeroDirection = 0;
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      if ((HeroY + 72) < 720) {
        HeroY += 72;
      }
      HeroDirection = 2;
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if ((HeroX + 72) < 720) {
        HeroX += 72;
      }
      HeroDirection = 3;
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      if ((HeroX - 72) >= 0) {
        HeroX -= 72;
      }
      HeroDirection = 1;
    }
    repaint();
  }
}