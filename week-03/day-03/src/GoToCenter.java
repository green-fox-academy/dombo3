import javax.swing.*;

import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

  public static final int WIDTH = 300;
  public static final int HEIGHT = 300;

  public static void mainDraw(Graphics graphics) {
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.
    lineCenter(30, 50, graphics);
    lineCenter(300, 65, graphics);
    lineCenter(70, 150, graphics);
  }

  public static void lineCenter(int x, int y, Graphics graphics) {
    graphics.drawLine(x, y, HEIGHT/2, WIDTH/2);
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