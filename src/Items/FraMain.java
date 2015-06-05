package Items;

import java.awt.Color;
import javax.swing.JFrame;

public class FraMain extends JFrame {

    FraMain() {
        PanBoard panBoard = new PanBoard();
        setSize(1280, 980);
        setTitle("YOU DA MAN");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //add(panBoard);
        setVisible(true);

    }
}