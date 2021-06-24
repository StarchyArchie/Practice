package SERLessons.Wagon;

import java.awt.*;
import java.awt.event.MouseEvent;
import wheels.users.Rectangle;
/**
 * Vishal Nigam
 * 2/20/18
 */
public class DraggableRectangle extends Rectangle implements Draggable {
    private int x,y,mousex,mousey;
    DraggableRectangle(Color c){
        super(c);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        super.mouseDragged(e);
        x = e.getX();
        y = e.getY();
        //setLocation(mousex-x,mousey-y);
        move((e.getX() - mousex),(e.getY()-mousey));
    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
        mousex = e.getX();
        mousey = e.getY();
    }

    @Override
    public void move(int x, int y) {
        setLocation(getXLocation()+x,getYLocation()+y);
    }
}
