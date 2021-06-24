package SERLessons.EmojiApp;
import wheels.users.*;
import java.awt.Color;
/**
 * Vishal Nigam
 * 2/6/18
 */
public class Emoji {
    protected Ellipse leftEye, rightEye,face;
    protected String name;
    protected String description;

    public Emoji(int x, int y){//Default constructor
      /*face = new Ellipse();
        face.setColor(Color.yellow);
        leftEye = new Ellipse(Color.black);
        rightEye = new Ellipse(Color.black);
        //set size
        rightEye.setSize(10,15);
        leftEye.setSize(10,15);
        //set locations
        face.setLocation(50,50);
        leftEye.setLocation(60,60);
        rightEye.setLocation(80,60);*/
        this(Color.yellow, x,y, "Happy");//calls other constructor and inputs predetermined parameters.
    }
    //parameterized constructor
    public Emoji(Color fa, int x, int y,String n){
        face = new Ellipse();
        face.setColor(fa);
        leftEye = new Ellipse(Color.black);
        rightEye = new Ellipse(Color.black);
        //set size
        rightEye.setSize(10,15);
        leftEye.setSize(10,15);
        //set locations
        this.setLoc(x,y);
        name = n;
    }
    //public abstract void setDescription(String s);
    public void faceColorSet(Color c){
        face.setColor(c);
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setLoc(int x, int y){
        //Sets face to (x,y) sets eyes relative to it.
        face.setLocation(x,y);
        leftEye.setLocation(x+10,y+10);
        rightEye.setLocation(x+30,y+10);
    }
}
