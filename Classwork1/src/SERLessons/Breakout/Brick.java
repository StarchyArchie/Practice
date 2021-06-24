package SERLessons.Breakout;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Vishal Nigam
 * 4/26/18
 */
public class Brick extends Rectangle2D.Double{
    private Color border, fill;
    private Rectangle2D brick;
    
    public Brick(){
        super();
        border = Color.GRAY;
        fill = Color.GREEN;
        brick = this;
        brick.setFrame(0, 0, 50, 20);
    }
    public Brick(int x, int y){
        this();
        brick.setFrame(x, y, 50, 20);
    }
    public void setLocation(int x, int y){
        brick.setFrame(brick.getX(), brick.getY(), x, y);
    }
    public void setFillColor(Color c) {
        border = c;
    }
    public void setBorderColor(Color c) {
        fill = c;
    }
    public void paint(Graphics2D brush) {
        brush.setColor(border);
        brush.draw(brick);
        brush.setColor(fill);
        brush.fill(brick);
    }
}
