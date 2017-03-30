
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GraphicOne {

  public static final int WIDTH = 300;
  public static final int HEIGHT = 300;

  public static void mainDraw(Graphics graphics) {
    drawRectCenter(300, graphics);
    drawRect(graphics);
  }

  public static void drawRect(Graphics graphics) {
    graphics.setColor(Color.BLACK);
    int size = HEIGHT/3;
    graphics.drawRect(WIDTH/3,0, size, size);
    graphics.drawRect(2*WIDTH/3,HEIGHT/3, size, size);
    graphics.drawRect(WIDTH/3,2*HEIGHT/3, size, size);
    graphics.drawRect(0,HEIGHT/3, size, size);
  }


  public static void drawRectCenter(int size, Graphics graphics) {
    graphics.setColor(Color.BLACK);
    graphics.drawRect(WIDTH/2 - size/2,HEIGHT/2 - size/2, size, size);
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
