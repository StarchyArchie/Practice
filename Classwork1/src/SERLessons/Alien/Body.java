package SERLessons.Alien;

import wheels.users.*;
import java.awt.Color;

/**
 * Vishal Nigam
 * 2/13/18
 * Practice 2
 * Constructs the body of an alien complete with limbs.
 */
public class Body {
    protected Rectangle larm, rarm, llimb, rlimb, body;
    private Color mai, alt;
    private Head head;
    private ClickBubble bubble;
    public Body(int x, int y,Color c, Color e, String txt){
        head = new Head(x,y,c,e);
        setBody(x,y);
        bodyColor(c,e);
        bubbleGen(txt,x,y,c,e);
        mai = c;
        alt = e;
    }
    public void bubbleGen(String z, int x, int y,Color c, Color e){
        bubble = new ClickBubble(z,c,e,this);
        bubble.setLocation(x-100,y-150);
    }
    public void setBody(int x, int y){
        body = new ClickRectangle(mai,alt,this);
        larm = new Rectangle();
        rarm = new Rectangle();
        rlimb = new Rectangle();
        llimb = new Rectangle();
        body.setLocation(x,y+50);
        larm.setLocation(x + 50, y + 70);
        larm.setSize(50,10);
        body.setSize(50, 80);
        rarm.setLocation(x - 50, y + 70);
        rarm.setSize(50, 10);
        rlimb.setLocation(x - 60, y + 70);
        rlimb.setSize(10, 50);
        llimb.setLocation(x + 100, y + 70);
        llimb.setSize(10, 50);
    }
        public void bodyColor(Color c,Color e){
            larm.setColor(c);
            rarm.setColor(c);
            body.setColor(e);
            llimb.setColor(e);
            rlimb.setColor(e);
    }
    public void setLocation(int x, int y){
        body.setLocation(x,y+50);
        larm.setLocation(x + 50, y + 70);
        rarm.setLocation(x - 50, y + 70);
        rlimb.setLocation(x - 60, y + 70);
        llimb.setLocation(x + 100, y + 70);
        head.setLocation(x,y);
    }
}
