package SERLessons.SketchPad;

import java.awt.*;

/**
 * Vishal Nigam
 * 3/1/18
 */
public class Cursor {
    private Point location;
    public Cursor(){
        location = new Point(350,250);
    }
    public void setLocation(Point p){
        location = p;
    }
    public Point getLocation(){
        return location;
    }
}
