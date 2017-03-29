import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {

  public static final int WIDTH = 300;
  public static final int HEIGHT = 300;

  public static void mainDraw(Graphics graphics) {
    int cubeSize = 30;
    for (int i = 0; i < WIDTH/cubeSize; i ++){
      for (int j = 0; j < HEIGHT/cubeSize; j++) {
        if (j % 2 == 0) {
          graphics.setColor(Color.BLACK);
        } else {
          graphics.setColor(Color.WHITE);
        }
        graphics.fillRect(i*cubeSize,j*cubeSize,cubeSize,cubeSize);
      }
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