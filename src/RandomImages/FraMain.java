package RandomImages;
// here, I have the colours changing, and the labels changing from one event listener - each. No hard code.

import java.awt.Color;
import you.da.man.*;
import javax.swing.JFrame;

public class FraMain extends JFrame {

    FraMain() {
        PanBoard panBoard = new PanBoard();
        setSize(1280, 980);
        setTitle("YOU DA MAN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panBoard);
        setVisible(true);

    }
}