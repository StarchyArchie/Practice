package SERLessons.Alien; /**
 * Vishal Nigam
 * 2/13/18
 * Practice 2
 * Assembles alien and sets it's color and dialogue.
 */
import java.awt.Color;
public class Alien {
    private Head head;
    private Body body;
    public Alien(int x, int y,Color c, Color e,String z){
        //Head head = new Head(x,y,c,e,z);
        Body body = new Body(x,y,c,e,"Howdy");
    }
    public Alien(){
        this(100,200,Color.BLUE,Color.BLACK,"Howdy");
    }
    public void setLocation(int x, int y){
        body.setLocation(x+20,y-50);
        head.setLocation(x+20,y);
    }
}
