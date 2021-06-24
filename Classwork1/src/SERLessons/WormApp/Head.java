package SERLessons.WormApp; /**
 * Generates an ellipse of one color with 2 fixed position eyes of a second color.
 * 
 * Vishal Nigam
 */

import wheels.users.*;
import java.awt.Color;

public class Head
{
    Ellipse _face;
    Ellipse _leye;
    Ellipse _reye;

    public Head(Color faceC, Color eyeC)
    {
        _face = new ClickableEllipse(faceC,eyeC);
        _leye  = new ClickableEllipse(eyeC,faceC);
        _reye = new ClickableEllipse(eyeC,faceC);
        
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

}
