package SERLessons.SketchPad;

import java.awt.*;

/**
 * Vishal Nigam
 * 3/1/18
 */
public class UpButton extends DrawButton{
    public UpButton(int x,int y,Cursor c){
        super(x,y,c);
    }
    public Point computeNextPoint(Point p){
        return new Point(p.x, p.y-5);
    }
}
