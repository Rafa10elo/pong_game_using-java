import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Paddle extends Rectangle {
    int id;
    int yVelocity;
    int speed = 10;
    Paddle(int x, int y , int paddleWidth , int paddleHeight, int id ){
super (x,y,paddleWidth,paddleHeight);
this.id = id ;

    }
    public void keyPressed(KeyEvent e)
    {
        switch (id) {
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirction(-speed);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirction(speed);
                    move();
                }
                break;
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirction(-speed);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirction(speed);
                    move();
                }
                break;
        }
    }
    public void keyReleased(KeyEvent e)
    {
        switch (id) {
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirction(0);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirction(0);
                    move();
                }
                break;
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirction(0);
                    move();
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirction(0);
                    move();
                }
                break;
        }

    }
    public void setYDirction(int yDirction){
        yVelocity= yDirction;


    }
    public void move(){
        y= y + yVelocity;
    }

    public void draw(Graphics g){
        if (id==1)
            g.setColor(Color.ORANGE);
        else
            g.setColor(Color.MAGENTA);
        g.fillRect(x,y,width,height);
    }
}

