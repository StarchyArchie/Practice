package SERLessons.WormApp; /**
 * Vishal Nigam
 * 2/9/18
 * Makes the body of the worm given 2 colors.
 */
import java.awt.Color;

public class Body {
    //private java.awt.Color _mainColor;
    //private java.awt.Color _alternateColor;
    private ClickableEllipseBody _bodySeg1;
    private ClickableEllipseBody _bodySeg2;
    private ClickableEllipseBody _bodySeg3;

public Body(Color maiC, Color alt) {
    _bodySeg1 = new ClickableEllipseBody(maiC,alt,this);
    _bodySeg2 = new ClickableEllipseBody(maiC,alt,this);
    _bodySeg3 = new ClickableEllipseBody(maiC,alt,this);
    _bodySeg1.setSize(60, 60);
    _bodySeg2.setSize(50, 50);
    _bodySeg3.setSize(40, 40);
    }
    public void setLocation(int x,int y){
        _bodySeg1.setLocation(x,y);
        _bodySeg2.setLocation(x+60,y+5);
        _bodySeg3.setLocation(x+110,y+10);
    }
    public void setBod(Color c){
        _bodySeg1.setColor(c);
        _bodySeg2.setColor(c);
        _bodySeg3.setColor(c);
    }
}
