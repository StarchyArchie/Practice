package SERLessons.Alien;

import wheels.users.Rectangle;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Vishal Nigam
 * 2/22/18
 */
public class ClickRectangle extends Rectangle implements Draggable{
    private Color mai,alt;
    private Body body;
    public void mouseClicked(MouseEvent e){
        body.setLocation(getXLocation()+20,getYLocation()-50);
    }
    public ClickRectangle(Color c, Color e, Body bod){
        mai = c;
        alt = e;
        body = bod;
    }
    public void move(int x, int y){

    }
    public void mousePressed(MouseEvent e){

    }
    public void mouseDragged(MouseEvent e){

    }
}

