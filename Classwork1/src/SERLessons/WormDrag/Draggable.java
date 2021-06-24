package SERLessons.WormDrag;

import java.awt.event.*;
public interface Draggable
{	public abstract void mousePressed(MouseEvent e);
 	public abstract void mouseDragged(MouseEvent e); 
 	public abstract void move(int distanceInX, int distanceInY);
}
