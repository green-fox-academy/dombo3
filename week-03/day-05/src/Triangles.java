
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
    drawTriangle(0,0, 300, graphics);
  }

  public static void drawTriangle(int posx, int posy, int size, Graphics graphics) {
    int[] arrayX = new int[3];
    int[] arrayY = new int[3];
    arrayX[0] = posx;
    arrayX[1] = posx + size;
    arrayX[2] = posx + size/2;
    arrayY[0] = posy;
    arrayY[1] = posy;
    arrayY[2] = posy + size;
    graphics.drawPolygon(arrayX, arrayY, 3);
    arrayX[0] = posx;
    arrayX[1] = posx + size/2;
    arrayX[2] = posx + size/4;
    arrayY[0] = posy;
    arrayY[1] = posy;
    arrayY[2] = posy + size/2;
    graphics.drawPolygon(arrayX, arrayY, 3);
    arrayX[0] = posx + size/2;
    arrayX[1] = posx + size;
    arrayX[2] = posx + 3*size/4;
    arrayY[0] = posy;
    arrayY[1] = posy;
    arrayY[2] = posy + size/2;
    graphics.drawPolygon(arrayX, arrayY, 3);
    arrayX[0] = posx + size/4;
    arrayX[1] = posx + 3*size/4;
    arrayX[2] = posx + size/2;
    arrayY[0] = posy + size/2;
    arrayY[1] = posy + size/2;
    arrayY[2] = posy + size;
    graphics.drawPolygon(arrayX, arrayY, 3);
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
