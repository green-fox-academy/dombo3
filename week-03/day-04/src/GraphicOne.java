
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GraphicOne {

  public static final int WIDTH = 300;
  public static final int HEIGHT = 300;

  public static void mainDraw(Graphics graphics) {
    drawPattern(0,0, 300, graphics);
  }

  public static void drawPattern(int posx, int posy, int size, Graphics graphics) {
    if (size < 1) {
      return;
    } else {
      graphics.setColor(Color.BLACK);
      graphics.drawRect(posx, posy, size, size);
      drawPattern(posx + size/3, posy, size/3, graphics);
      drawPattern(posx + 2*size/3,posy + size/3, size/3, graphics);
      drawPattern(posx + size/3,posy + 2 * size/3, size/3, graphics);
      drawPattern(posx,posy + size/3, size/3, graphics);
//      times--;
    }
  }

  public static void drawRectangle(int posx, int posy, int size, Graphics graphics) {

  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.YELLOW);
      mainDraw(graphics);
    }
  }
}
