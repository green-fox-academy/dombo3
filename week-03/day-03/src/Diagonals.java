import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {

  public static final int WIDTH = 300;
  public static final int HEIGHT = 300;

  public static void mainDraw(Graphics graphics) {
    graphics.setColor(Color.GREEN);
    graphics.drawLine(0,HEIGHT, WIDTH, 0);
    graphics.drawLine(0, 0, WIDTH, HEIGHT);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
