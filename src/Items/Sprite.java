package Items;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Sprite {
    
    private BufferedImage biSpriteSheet;
    private static final int TILE_SIZEX = 160 / 3;
    private static final int TILE_SIZEY = 61 / 1;

    public void loadSprite(String sFile) {
        try {
            biSpriteSheet = ImageIO.read(new File(sFile));;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public BufferedImage getSprite(int xGrid, int yGrid) {
        return biSpriteSheet.getSubimage(xGrid * TILE_SIZEX, yGrid * TILE_SIZEY, TILE_SIZEX, TILE_SIZEY);
    }
}
