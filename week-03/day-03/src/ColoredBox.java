import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

  public static void mainDraw(Graphics graphics) {
    // draw a box that has different colored lines on each edge.
    int startPointX = 20;
    int startPointY = 20;
    int width = 80;
    int height = 80;

    graphics.setColor(Color.BLUE);
    graphics.drawLine(startPointX, startPointY, startPointX, startPointY + height);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(startPointX, startPointY + height, startPointX + width, startPointY +
              height);
    graphics.setColor(Color.YELLOW);
    graphics.drawLine(startPointX + width, startPointY + height, startPointX + width,
              startPointY);
    graphics.setColor(Color.RED);
    graphics.drawLine(startPointX + width, startPointY, startPointX, startPointY);
  }

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
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