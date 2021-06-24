package SERLessons.WormDrag;
/**
 * Write a description of class Head here.
 * 
 * @author  Vishal Nigam
 * @version (a version number or a date)
 */

import java.awt.*;

public class Head
{
    DraggableEllipse _face;
    DraggableEllipse _leye;
    DraggableEllipse _reye;
    int _x,_y;
    public Head(Color mainColor,Color altColor , Worm wormy)
    {
        _face = new DraggableEllipse(altColor,wormy);
        _leye  = new DraggableEllipse(mainColor,wormy);
        _reye = new DraggableEllipse(mainColor,wormy);
        
        _face.setSize(80,80);
        _leye.setSize(10,10);
        _reye.setSize(10,10);
        
    }
    /* setLocation accepts an x and y coordinate for the location of the face ans
     * sets the locations of the eyes relative to the face
     */
    public void setLocation(int x, int y){
      _face.setLocation(x,y);
      _leye.setLocation(x+20,y+20);
      _reye.setLocation(x+40,y+20);
    }
    public void move (int distanceInX, int distanceInY)
    {
        setLocation(_x+distanceInX,_y+distanceInY);
    }
}
