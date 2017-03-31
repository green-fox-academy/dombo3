
import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  public static final int WIDTH = 300;
  public static final int HEIGHT = 300;

  public static void mainDraw(Graphics graphics) {

  }

  public static void drawPattern(int posx, int posy, int size, Graphics graphics) {

  }

  public static void drawTriangle() {

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
