package SERLessons.Breakout;

import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Vishal Nigam
 * 4/26/18
 */
public class Ball extends Ellipse2D.Double{
    private Ellipse2D ball;
    private Color fill,border;
    private boolean checkX,checkY;//Xfalse = left, Xtrue = right, Yfalse = up, Ytrue = down.
    public Ball(){
        super();
        ball = this;
        ball.setFrame(450,600,10,10);
        border = Color.BLACK;
        fill = Color.cyan;
        checkX = true;
        checkY = false;
    }
    public Ball(int x, int y){
        this();
        ball.setFrame(x,y,10,10);
    }
    public void setCheckX(){
        if(checkX){
            checkX=false;
        }
        else checkX = true;
    }
    public void setCheckY(){
        if(checkY){
            checkY=false;
        }
        else checkY = true;
    }
    public void move(double x, double y){//Passes two doubles to move ball that many units.
        //each of these checks two boolean statements to determine direction of ball movement.
        if(checkX&&checkY){//down right
            ball.setFrame(ball.getX()+x,ball.getY()+y,ball.getWidth(),ball.getHeight());
        }
        if(checkX&&!checkY){//up right
            ball.setFrame(ball.getX()+x,ball.getY()-y,ball.getWidth(),ball.getHeight());
        }
        if(!checkX&&checkY){//down left
            ball.setFrame(ball.getX()-x,ball.getY()+y,ball.getWidth(),ball.getHeight());
        }
        if(!checkX&&!checkY){//up left
            ball.setFrame(ball.getX()-x,ball.getY()-y,ball.getWidth(),ball.getHeight());
        }
        //bounces ball off of sides of panel.
        if(ball.getCenterX()+x>900){
            checkX=false;
        }
        if(ball.getCenterX()+x<5){
            checkX=true;
        }
        //bounces ball off of top of panel.
        if(ball.getCenterY()+y<5){
            checkY=true;
        }
    }
    public void paint(Graphics2D brush) {//draws ball with set color.
        brush.setColor(border);
        brush.draw(ball);
        brush.setColor(fill);
        brush.fill(ball);
    }

}
