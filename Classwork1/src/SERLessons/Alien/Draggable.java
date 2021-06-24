package SERLessons.Alien;

import java.awt.event.MouseEvent;

public interface Draggable
{	public abstract void mousePressed(MouseEvent e);
 	public abstract void mouseDragged(MouseEvent e); 
 	public abstract void move(int distanceInX, int distanceInY);
}
