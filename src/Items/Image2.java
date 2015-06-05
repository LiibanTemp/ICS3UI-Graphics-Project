package Items;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.*;
class Image2 {
    
    private Image img2;
    int i,a;
    int x, y, bx, by, dx, dy, backgroundX;
    private final int SPEED = 15;
    boolean left, right, up, down;
    ImageIcon Blast1 = new ImageIcon("AuraSphere1.png");
    ImageIcon Blast2 = new ImageIcon("AuraSphere2.png");
    ImageIcon Blast3 = new ImageIcon("AuraSphere3.png");
    ImageIcon Blast4 = new ImageIcon("AuraSphere4.png");
    int imgWidth1 = Blast1.getIconHeight();
    int imgHeight1 = Blast2.getIconWidth();
    int imgWidth2 = Blast3.getIconHeight();
    int imgHeight2 = Blast4.getIconWidth(); 
    Image arnBlast[] = new Image[4];
    Rectangle r,r2;

    public Image2() {
        r = new Rectangle(x, y, imgWidth1, imgHeight1);
        r2 = new Rectangle(x, y, imgWidth2, imgHeight2);
        x = 550;
        y = 200;
        dx = 0;
        dy = 0;
        left = false;
        right = false;
        up = false;
        down = false;
        arnBlast[0] = Blast1.getImage();
        arnBlast[1] = Blast2.getImage();
        arnBlast[2] = Blast3.getImage();
        arnBlast[3] = Blast4.getImage();
        
        
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
        img2 = arnBlast[a];
        return img2;
        
    }

    public void keyPressed(KeyEvent w) {
        int code = w.getKeyCode();
        if (code == KeyEvent.VK_LEFT) {
            a=0;
            dx = -SPEED;
        } else if (code == KeyEvent.VK_RIGHT) {
            a=1;
            dx = SPEED;
        } else if (code == KeyEvent.VK_UP) {
            a=2;
            dy = -SPEED;
        } else if (code == KeyEvent.VK_DOWN) {
            a=3;
            dy = SPEED;
        }
        
    }
    public void keyReleased(KeyEvent w) {
        dy = 0;
        dx = 0;
    }
}