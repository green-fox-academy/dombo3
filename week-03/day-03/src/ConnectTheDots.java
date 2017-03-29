import javax.swing.*;
import java.awt.*;
import java.util.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

  public static final int WIDTH = 300;
  public static final int HEIGHT = 300;

  public static void mainDraw(Graphics graphics) {
    int[][] Box = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
    int[][] Unknown = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130},
            {50, 100}};

    drawDots(Box, graphics);
    drawDots(Unknown, graphics);
  }

  public static void drawDots(int[][] dotPairs, Graphics graphics) {

    ArrayList<Integer> xPointsList = new ArrayList<>();
    ArrayList<Integer> yPointsList = new ArrayList<>();

    int nPoints = dotPairs.length;

    for (int i = 0; i < dotPairs.length; i++){
      xPointsList.add(dotPairs[i][0]);
      yPointsList.add(dotPairs[i][1]);
    }

    int[] xPoints = convertIntegers(xPointsList);
    int[] yPoints = convertIntegers(yPointsList);

    graphics.drawPolygon(xPoints,yPoints,nPoints);
  }

  public static int[] convertIntegers (ArrayList<Integer> integers) {
    int[] ret = new int[integers.size()];
    for (int i = 0; i < ret.length; i++) {
      ret[i] = integers.get(i).intValue();
    }
    return ret;
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