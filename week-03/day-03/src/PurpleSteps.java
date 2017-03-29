import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {

  public static final int WIDTH = 300;
  public static final int HEIGHT = 300;

  public static void mainDraw(Graphics graphics) {
    Graphics2D g2d = (Graphics2D) graphics;
    int size = 22;
    for (int i = 0; i < 300; i+=size){
      g2d.setColor(Color.RED);
      g2d.fillRect(20 +i ,20+i,size,size);
      g2d.setColor(Color.BLACK);
      g2d.setStroke(new BasicStroke(2));
      g2d.drawRect(20+i,20+i,size,size);
    }
  }

  public static void drawSteps(Graphics graphics) {

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