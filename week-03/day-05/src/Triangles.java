
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

  public static final int WIDTH = 316;
  public static final int HEIGHT = 338;

  public static void mainDraw(Graphics graphics) {
    drawPattern(graphics);
  }

  public static void drawPattern(Graphics graphics) {
    drawTriangle(graphics);
  }

  public static void drawTriangle(Graphics graphics) {
    int[] posx = {0,300,300/2};
    int[] posy = {0,0,300};
    graphics.drawPolygon(posx, posy, 3);
    
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
      this.setBackground(Color.WHITE);
      mainDraw(graphics);
    }
  }

  public static void SavePaint(JFrame jFrame) {
    try {
      BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
      Graphics2D graphics2D = image.createGraphics();
      jFrame.paint(graphics2D);
      ImageIO.write(image,"jpeg", new File("jmemTriangle.jpeg"));
    } catch(Exception exception) {
      System.out.println("Exception occured: " + exception.getClass());
    }
  }

}
