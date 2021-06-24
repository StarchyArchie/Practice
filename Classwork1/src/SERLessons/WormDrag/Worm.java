package SERLessons.WormDrag;
/**
 * Write a description of class Worm here.
 * 
 * @author Vishal Nigam
 */

public class Worm{
    private java.awt.Color _mainColor;
    private java.awt.Color _alternateColor;
    private Head _head;
    private Body _body;
    private int _x;
    private int _y;
   
    
    public Worm(java.awt.Color mainColor,java.awt.Color altColor){
        _mainColor = mainColor;
        _alternateColor = mainColor;
        _head = new Head(mainColor,altColor,this);
        _body = new Body(mainColor,altColor,this);
      
  }
  
  public void setLocation(int x, int y) {
      _x = x;
      _y = y;
    _head.setLocation(x,y);
    _body.setLocation(x+70,y+40);
    
  }
    public void move (int distanceInX, int distanceInY)
    {
        setLocation(_x+distanceInX,_y+distanceInY);
    }
   public int getX() {
    return _x;
  }
  public int getY(){
    return _y;
    }
}

