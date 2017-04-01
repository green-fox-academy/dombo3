
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GraphicOne {

  public static final int WIDTH = 500;
  public static final int HEIGHT = 500;

  public static void mainDraw(Graphics graphics) {
    drawPattern(0,0, 300, graphics);
  }

  public static void drawPattern(int posx, int posy, int size, Graphics graphics) {
    if (size < 1) {
      return;
    } else {
      graphics.setColor(Color.BLACK);
      graphics.drawRect(posx, posy, size, size);
      drawPattern(posx + size/3, posy, size/3, graphics);
      drawPattern(posx + 2*size/3,posy + size/3, size/3, graphics);
      drawPattern(posx + size/3,posy + 2 * size/3, size/3, graphics);
      drawPattern(posx,posy + size/3, size/3, graphics);
//      times--;
    }
  }


  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    SavePaint(jFrame);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.YELLOW);
      mainDraw(graphics);
    }
  }
  public static void SavePaint(JFrame jFrame) {
    try {
      BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
      Graphics2D graphics2D = image.createGraphics();
      jFrame.paint(graphics2D);
      ImageIO.write(image,"jpeg", new File("Graphic.jpeg"));
    } catch(Exception exception) {
      System.out.println("Exception occured: " + exception.getClass());
    }
  }

}
