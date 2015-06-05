package Items;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class PanBoard extends JPanel implements ActionListener {

    static boolean drawn = false;
    Rectangle rB, rE, rP, RI;
    private Player p;
    private Enemy e;
    private Image2 i;
    Sprite s;
    private Timer timer;
    private Image background;
    static String sName;
    Label JLabel;
    int nChange = 1, nX, nY;
    String sFile;
    BufferedImage biSpriteSheet, biSprite;
    
    public PanBoard() {
        sFile = "Sprite.png";
        nX = 0;
        nY = 0;
        p = new Player();
        e = new Enemy();
        i = new Image2();
        s = new Sprite();
        s.loadSprite(sFile);
        addKeyListener(new Movement());
        setFocusable(true);
        ImageIcon i1 = new ImageIcon("Background.png");
        background = i1.getImage();
        timer = new Timer(60, this);
        timer.start();

    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        System.out.println("Starting Action Performed...");
        p.move();
        repaint();
        /*if(nX>5){ 
            nX = 0;
            nY++;
        }
        if(nY>3) nY =1;    */   
        biSprite = s.getSprite(0, 0);
        //System.out.println(nX + " " + nY);
        repaint();
        
        nX++;
        System.out.println("...Ending Action Performed");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("Painting!");
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(background, 0, 0, null);
        g2d.drawImage(biSprite, 100, 100, null);
        g2d.drawImage(p.getImage(), e.getX(), e.getY(), null);
        //g2d.drawImage(biSprite, 100, 100, null);
        //g2d.drawImage(i.getImage(), i.getX(), i.getY(), null);
        isHit();
    }

    boolean isHit() {
        rB = p.getRect();
        rE = e.getRect();
        //RI = i.getRect();
        if (rB.intersects(rE)) {
            System.out.println("HIT");
            return true;
            
        } else {
            return false;
        }

    }

    private class Movement extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent w) {
            p.keyReleased(w);
        }

        @Override
        public void keyPressed(KeyEvent w) {
            p.keyPressed(w);
        }
    }
}
