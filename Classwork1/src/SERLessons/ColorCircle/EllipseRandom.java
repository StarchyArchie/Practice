package SERLessons.ColorCircle;

import wheels.users.Ellipse;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * Vishal Nigam
 * 3/3/18
 */
public class EllipseRandom extends Ellipse{
    Color color1,current;
    Random rand;
    public void mouseClicked(MouseEvent e){
        rand = new Random();
        setColor(current);
        int rValue1 = rand.nextInt(255);
        int rValue2 = rand.nextInt(255);
        int rValue3 = rand.nextInt(255);
        color1 = new Color(rValue1,rValue2,rValue3);
        current = color1;
    }
    public EllipseRandom(Color c){
        setColor(c);
        current = c;
    }
    public EllipseRandom(){
        this(Color.red);
    }
}
