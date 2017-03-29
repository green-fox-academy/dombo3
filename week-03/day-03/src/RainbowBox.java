import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBox {

  public static final int WIDTH = 300;
  public static final int HEIGHT = 300;

  public static void mainDraw(Graphics graphics) {
    for (int i = 0; i < 100; i++){
      centerBox(getSize(), getRainbowColor(), graphics);
    }
  }

  public static void centerBox(int size, int color, Graphics graphics) {
    graphics.setColor(new Color(color));
    graphics.fillRect(WIDTH/2 - size/2,HEIGHT/2 - size/2, size, size);
  }

  public static int getSize() {
    int size = (int) ((Math.random()*10 + 1) *30);
    return size;
  }

  public static int getRainbowColor() {
    int numToSeven = (int) (Math.random()*8);
    int color = 0x000000;
    switch (numToSeven) {
      case 1:
        return color = 0xFF0000;
      case 2:
        return color = 0xFF7F00;
      case 3:
        return color = 0xFFFF00;
      case 4:
        return color = 0x00FF00;
      case 5:
        return color = 0x0000FF;
      case 6:
        return color = 0x4B0082;
      case 7:
        return color = 0x9400D3;
      default:
        return color = 0xFF0000;
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