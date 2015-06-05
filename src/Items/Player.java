package Items;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Player {

    private Image img;
    private BufferedImage biSpriteSheet;
    int i, a;
    int x, y, bx, by, dx, dy, backgroundX, nYMain, nXMain, nY, nX, nY2, nX2;
    private final int SPEED = 15;
    boolean left, right, up, down;
    boolean arImage[][] = new boolean[6][4];
    ImageIcon p = new ImageIcon("spritesheet.png");
    int W = p.getIconHeight() / 4;
    int H = p.getIconWidth() / 6;
    
    public void loadSprite(String sFile) {
       try {
       biSpriteSheet = ImageIO.read(new File("spritesheet.png"));;
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
    int rows = 6;
    int cols = 4;
    int width = 153;
    int height = 204;
    BufferedImage[] sprites = new BufferedImage[rows * cols];
   
//BufferedImage bigImg = ImageIO.read(new File("spritesheet.png"));
    Rectangle r;

    public Player() {
        r = new Rectangle();
        x = 550;
        y = 200;
        dx = 0;
        dy = 0;
        nY = nY2 * W;
        nX = nX2 * H;
        left = false;
        right = false;
        up = false;
        down = false;
//       for (int i = 0; i < rows; i++)
//{
//    for (int j = 0; j < cols; j++)
//    {
//        sprites[(i * cols) + j] = biSpriteSheet.getSubimage(
//            j * width,
//            i * height,
//            width,
//            height
//        );
//    }
//}

    }

    public Rectangle getRect() {
        r.setBounds(nX, nY, W, H);
        return r;
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        img = p.getImage();
        return img;

    }
    public void keyPressed(KeyEvent w) {
        int code = w.getKeyCode();
        nX2++;
        if (nX2 == 6) {
            nX2 = 1;
        }
        if (code == KeyEvent.VK_A) {
            nY2 = 3;
            dx = -SPEED;
        } else if (code == KeyEvent.VK_D) {
            nY2 = 4;
            dx = SPEED;
        } else if (code == KeyEvent.VK_W) {
            nY2 = 2;
            dy = -SPEED;
        } else if (code == KeyEvent.VK_S) {
            nY2 = 1;
            dy = SPEED;
        }
        if (code == KeyEvent.VK_LEFT) {
            a = 0;
            dx = -SPEED;
        } else if (code == KeyEvent.VK_RIGHT) {
            a = 1;
            dx = SPEED;
        }
    }

    public void keyReleased(KeyEvent w) {
        dy = 0;
        dx = 0;

    }
}
