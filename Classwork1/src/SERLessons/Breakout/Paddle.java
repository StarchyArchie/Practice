package SERLessons.Breakout;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Vishal Nigam
 * 4/26/18
 */
public class Paddle extends Rectangle2D.Double{
    private Rectangle2D paddle;
    private DrawingPanel dp;
    private Color border, fill;
    public Paddle(DrawingPanel draw){
        super();
        border = Color.GRAY;
        fill = Color.BLUE;
        paddle = this;
        paddle.setFrame(400,650,120,15);
        dp = draw;
    }
    public Paddle(int x, int y, DrawingPanel draw){
        this(draw);
        paddle.setFrame(x,y,120,15);
    }
    public void move(int x){
        paddle.setFrame(x,650,120,15);
    }
    public void paint(Graphics2D brush) {
        brush.setColor(border);
        brush.draw(paddle);
        brush.setColor(fill);
        brush.fill(paddle);
    }
}
