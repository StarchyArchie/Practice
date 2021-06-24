package SERLessons.Swingin.AnimAlien;

import SERLessons.Swingin.Clock.ColorEllipse;

import java.awt.*;

/**
 * Vishal Nigam
 * 3/22/18
 */
public class NiceAlien {
    protected ColorEllipse face, leye, reye;
    private Color faceColor, eyeColor;
    private double alienX, alienY;
    public NiceAlien(double x, double y, Color border, Color fill){
        face = new ColorEllipse();
        leye = new ColorEllipse();
        reye = new ColorEllipse();
        face.setColor(fill,border);
        leye.setColor(border,fill);
        reye.setColor(border,fill);
        this.setLocation(x,y);
    }
    public void setLocation(double x,double y){
        face.setLocation(x,y);
        face.setSize(140,140);
        leye.setLocation(x+33, y+20);
        leye.setSize(10,15);
        reye.setLocation(x+64, y+20);
        reye.setSize(10,15);
        alienX = x;
        alienY = y;
    }
    public void paint(Graphics2D brush){
        face.paint(brush);
        leye.paint(brush);
        reye.paint(brush);
    }
    public NiceAlien(){
        this(100,100,Color.black,Color.red);
    }
    public void move(double dx, double dy){
        this.setLocation(alienX+dx, alienY+dy);
    }
}
