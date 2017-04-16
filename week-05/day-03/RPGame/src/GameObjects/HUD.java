package GameObjects;

import java.awt.*;

/*
 *Be careful this code needs to be refacted.
 */

public class HUD {
  public Font heading1 = new Font("Dialog", Font.BOLD, 30);
  public Font heading2 = new Font ("Calibri", Font.BOLD, 24);
  public Font paragraph = new Font("Calibri", Font.BOLD, 20);

  public HUD(Graphics graphics, GameMap gameMap, InitChar characters) {
    FontMetrics metrics = graphics.getFontMetrics();

    graphics.setFont(heading1);
    graphics.drawString("Level " + gameMap.gameLevel, gameMap.col * gameMap.TILESIZE,
            heading1.getSize());

    graphics.setFont(heading2);
    graphics.drawString("Hero", gameMap.col * gameMap.TILESIZE, heading1.getSize() * 2);
    graphics.setFont(paragraph);
    graphics.drawString("HP: " + characters.getHero().HP, gameMap.col * gameMap.TILESIZE,
            heading1.getSize() * 2 + heading2.getSize());
    graphics.drawString("DP: " + characters.getHero().DP, gameMap.col * gameMap.TILESIZE,
            heading1.getSize() * 2 + 2 * heading2.getSize());
    graphics.drawString("SP: " + characters.getHero().SP, gameMap.col * gameMap.TILESIZE,
            heading1.getSize() * 2 + 3 * heading2.getSize());

    for (Skeleton skeleton : characters.getSkeletons()) {
      if (characters.getHero().getPosX() == skeleton.getPosX() && characters.getHero().getPosY()
              == skeleton.getPosY()) {
        graphics.setFont(heading2);
        graphics.drawString("Skeleton", gameMap.col * gameMap.TILESIZE, heading1.getSize() * 8);
        graphics.setFont(paragraph);
        graphics.drawString("HP: " + skeleton.HP, gameMap.col * gameMap.TILESIZE,
                heading1.getSize() * 8 + heading2.getSize());
        graphics.drawString("DP: " + skeleton.DP, gameMap.col * gameMap.TILESIZE,
                heading1.getSize() * 8 + 2 * heading2.getSize());
        graphics.drawString("SP: " + skeleton.SP, gameMap.col * gameMap.TILESIZE,
                heading1.getSize() * 8 + 3 * heading2.getSize());
      }
    }

    if (characters.getHero().getPosX() == characters.getBoss().getPosX() && characters.getHero().getPosY()
            == characters.getBoss().getPosY()) {
      graphics.setFont(heading2);
      graphics.drawString("Boss", gameMap.col * gameMap.TILESIZE, heading1.getSize() * 8);
      graphics.setFont(paragraph);
      graphics.drawString("HP: " + characters.getBoss().HP, gameMap.col * gameMap.TILESIZE,
              heading1.getSize() * 8 + heading2.getSize());
      graphics.drawString("DP: " + characters.getBoss().DP, gameMap.col * gameMap.TILESIZE,
              heading1.getSize() * 8 + 2 * heading2.getSize());
      graphics.drawString("SP: " + characters.getBoss().SP, gameMap.col * gameMap.TILESIZE,
              heading1.getSize() * 8 + 3 * heading2.getSize());
    }
//    String fonts[] =
//            GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//
//    for ( int i = 0; i < fonts.length; i++ ) {
//      System.out.println(fonts[i]);
//    }
  }
}