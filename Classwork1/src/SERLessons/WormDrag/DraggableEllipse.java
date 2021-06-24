package SERLessons.WormDrag;//Vishal Nigam
import wheels.users.*;
import java.awt.event.*;
public class DraggableEllipse extends Ellipse implements Draggable
{
    int _clickLocX,_clickLocY,_x,_y;
    Worm wormy;
    public DraggableEllipse (java.awt.Color mainColor, Worm worm){
    super(mainColor);
        wormy = worm;
  }
    public void move(int distanceInX, int distanceInY){
        wormy.setLocation(distanceInX + _x, distanceInY + _y);
  }
    public void mouseDragged(MouseEvent e){
         wormy.move(e.getX() - _clickLocX, e.getY() - _clickLocY);
        _clickLocY = e.getY();
        _clickLocX = e.getX();
   }
    public void mousePressed(MouseEvent e){
       _clickLocY = e.getY();
       _clickLocX = e.getX();
   }
    public void setLocation(int x,int y){
        super.setLocation(x,y);
        _x=x;
        _y=y;
    }
}   
