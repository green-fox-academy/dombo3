import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

  public static final int WIDTH = 300;
  public static final int HEIGHT = 300;

  public static void mainDraw(Graphics graphics) {
    drawSteps(30,graphics);
  }

  public static void drawSteps(int squareSize, Graphics graphics) {
    Graphics2D g2d = (Graphics2D) graphics;
    for (int i = 0; i < 300; i+=squareSize){
      g2d.setColor(Color.RED);
      g2d.fillRect(0 +i ,0+i,squareSize,squareSize);
      g2d.setColor(Color.BLACK);
      g2d.setStroke(new BasicStroke(0));
      g2d.drawRect(0+i,0+i,squareSize,squareSize);
    }
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