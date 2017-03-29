import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

  public static final int WIDTH = 300;
  public static final int HEIGHT = 300;

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.RED);
    graphics.fillRect(30, 40, 10, 60);
    graphics.setColor(Color.GREEN);
    graphics.fillRect(60, 100, 50, 10);
    graphics.setColor(Color.BLUE);
    graphics.fillRect(200, 40, 80, 30);
    graphics.setColor(Color.PINK);
    graphics.fillRect(130, 140, 30, 30);
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
      mainDraw(graphics);

    }
  }

}
