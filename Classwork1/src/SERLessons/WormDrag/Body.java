package SERLessons.WormDrag;//Vishal Nigam
import wheels.users.*;
public class Body
{
   private Ellipse _bodySeg1;
    private Ellipse _bodySeg2;
    private Ellipse _bodySeg3;
    private java.awt.Color _mainColor;
    private java.awt.Color _alternateColor;
    int _x;
    int _y;

 
    
    public Body(java.awt.Color mainColor, java.awt.Color altColor,Worm wormy) {
        _mainColor = mainColor;
        _alternateColor = altColor;
        
        _bodySeg1 = new DraggableEllipse(mainColor,wormy);
        _bodySeg2 = new DraggableEllipse(altColor,wormy);
        _bodySeg3 = new DraggableEllipse(mainColor,wormy);
      
        _bodySeg1.setSize(60,60);
        _bodySeg2.setSize(50,50);
         _bodySeg3.setSize(40,40);
        
    }
     public void setLocation(int x, int y){
        _x = x;
	    _y = y;
        _bodySeg1.setLocation(x,y);
        _bodySeg2.setLocation(x+60,y+5);
        _bodySeg3.setLocation(x+ 110,y+10);
  
     }
     
    public void move (int distanceInX, int distanceInY)
	 {
        setLocation(_x + distanceInX, _y + distanceInY);
    }
}
