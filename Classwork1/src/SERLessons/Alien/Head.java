package SERLessons.Alien;

import wheels.users.*;
import java.awt.Color;

/**
 * Vishal Nigam
 * 2/13/18
 * Practice 2
 *Constructs the head of an alien and a speech bubble above.
 */
public class Head {
    protected Ellipse face, Leye, Reye, mouth;
    protected Line antenna1, antenna2;
    public Head(int x, int y,Color c, Color e){
        setLoc(x,y);
        colorSetter(c,e);
    }

    public void setLoc(int x, int y) {
        //Sets face to (x,y) sets eyes relative to it.
        face = new Ellipse();
        Reye = new Ellipse();
        Leye = new Ellipse();
        antenna1 = new Line();
        antenna2 = new Line();
        mouth = new Ellipse();
        face.setLocation(x, y);
        Leye.setLocation(x + 10, y + 10);
        Reye.setLocation(x + 30, y + 10);
        Reye.setSize(10, 15);
        Leye.setSize(10,15);
        antenna1.setP1(x + 10, y + 5);
        antenna1.setP2(x, y - 10);
        antenna2.setP1(x + 30, y);
        antenna2.setP2(x + 20, y - 10);
        mouth.setLocation(x+25,y+30);
        mouth.setSize(5,5);
    }
    public void colorSetter(Color c, Color e){
        face.setColor(c);
        Leye.setColor(e);
        Reye.setColor(e);
        mouth.setColor(e);
        antenna1.setColor(c);
        antenna2.setColor(c);
    }
    public void setLocation(int x, int y){
        face.setLocation(x, y);
        Leye.setLocation(x + 10, y + 10);
        Reye.setLocation(x + 30, y + 10);
        antenna1.setP1(x + 10, y + 5);
        antenna1.setP2(x, y - 10);
        antenna2.setP1(x + 30, y);
        antenna2.setP2(x + 20, y - 10);
        mouth.setLocation(x+25,y+30);
    }
}
