/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomImages;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

public class Sprites {

    private BufferedImage biSpriteSheet;
    private static final int TILE_SIZE = 125;

    public void loadSprite(String sFile) {
        try {
            biSpriteSheet = ImageIO.read(new File("Sprite.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public BufferedImage getSprite(int xGrid, int yGrid) {
        return biSpriteSheet.getSubimage(xGrid * TILE_SIZE, yGrid * TILE_SIZE, TILE_SIZE, TILE_SIZE);
    }
} 