import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

  public static final int WIDTH = 300;
  public static final int HEIGHT = 300;

  public static void mainDraw(Graphics graphics) {
    int[][] dotPairs = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
    ArrayList<Integer> xPointsList = new ArrayList<>();
    ArrayList<Integer> yPointsList = new ArrayList<>();
    int nPoints = dotPairs.length;

    for (int i = 0; i < dotPairs.length; i++){
        xPointsList.add(dotPairs[i][0]);
        yPointsList.add(dotPairs[i][1]);
      }

    System.out.println(xPointsList);
    System.out.println(yPointsList);


    /*graphics.drawPolygon()*/;
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