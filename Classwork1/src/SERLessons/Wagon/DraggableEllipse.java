package SERLessons.Wagon;

import wheels.users.Ellipse;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Vishal Nigam
 * 2/20/18
 */
public class DraggableEllipse extends Ellipse implements Draggable{
    private int x,y,mousex,mousey;
    private Draggable componentOf;//refrence to container object
    DraggableEllipse(Color c,Draggable comp){//pass through constructor
        super(c);
        //set instance variable to passed parameter
        componentOf = comp;
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        componentOf.mouseDragged(e);
        x = e.getX();
        y = e.getY();
        //setLocation(mousex-x,mousey-y);
        move((e.getX() - mousex),(e.getY()-mousey));
    }

    @Override
    public void mousePressed(MouseEvent e) {
        componentOf.mousePressed(e);
        mousex = e.getX();
        mousey = e.getY();
    }

    @Override
    public void move(int x, int y) {
        setLocation(getXLocation()+x,getYLocation()+y);
    }
}
