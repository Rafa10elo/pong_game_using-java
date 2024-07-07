import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Ball extends Rectangle {
    Random random;
    int xVelocity;
    int yVelocity;
    int ballSpeed =5 ;

    Ball(int x , int y ,int width,int height){
        super(x,y,width,height);
        random= new Random();
        int randomXDircetion = random.nextInt(2);
        if(randomXDircetion==0)
            randomXDircetion--;
        setXDirction(randomXDircetion*ballSpeed);
        int randomYDircetion = random.nextInt(2);
        if(randomYDircetion==0)
            randomYDircetion--;
        setYDirction(randomYDircetion*ballSpeed);
    }
    public void setYDirction(int randomYDirection){
        yVelocity=randomYDirection;

    }
    public void setXDirction(int randomXDirection){
        xVelocity=randomXDirection;

    }
    public void move(){
        x+=xVelocity;
        y+=yVelocity;
    }
    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        g.fillOval(x,y,width,height);
    }

}
