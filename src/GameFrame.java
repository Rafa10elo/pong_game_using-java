import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GameFrame extends JFrame {
    GamePanel panel ;

    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("PONG");
        this.setResizable(false);
        this.setBackground(new Color(20,30,230));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
