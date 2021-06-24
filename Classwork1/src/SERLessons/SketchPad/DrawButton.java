package SERLessons.SketchPad;

import wheels.users.Line;
import wheels.users.Rectangle;
import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Vishal Nigam
 * 3/1/18
 */
public abstract class DrawButton extends Rectangle {
    private Cursor cursor;
    public DrawButton(int x, int y, Cursor c){
        super(x,y);
        cursor = c;
        this.setSize(20,20);
    }
    public abstract Point computeNextPoint(Point p);
    public void mousePressed(MouseEvent e){
        this.setFillColor(Color.blue);
        Point current = cursor.getLocation();
        Point next = computeNextPoint(current);
        Line line = new Line(current, next);
        line.setThickness(2);
        line.setColor(Color.black);
        cursor.setLocation(next);
    }
    public void mouseReleased(MouseEvent e){
        this.setFillColor(Color.red);
    }
}
