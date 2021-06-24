package SERLessons.Swingin.Smartshapes;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Vishal Nigam
 * 4/4/18
 */
public class Aircraft {
    protected SmartShape body,wing1,wing2,tail;
    protected AirProxy current;
    private double airX, airY;
    public Aircraft(int x, int y, int sizeX, int sizeY, Color mai, Color alt){
        airX = x;
        airY = y;
        current = new AirProxy(this);
        body = new SmartShape(new Ellipse2D.Double(),x,y,sizeX,sizeY, this, current);
        wing1 = new SmartShape(new Rectangle2D.Double(),x-10,y+10,sizeX/2,sizeY,this,current);
        wing2 = new SmartShape(new Rectangle2D.Double(),x+60,y+10,sizeX/2,sizeY,this,current);
        tail = new SmartShape(new Ellipse2D.Double(),x+33,y+15,sizeX/3,sizeY/3,this,current);
        body.setColor(mai);
        wing1.setColor(alt);
        wing2.setColor(alt);
        tail.setColor(Color.blue);
        wing1.setRotation(45.0);
        wing2.setRotation(135.0);
    }
    public Aircraft getAir(){
        return this;
    }
    public boolean contains(int x, int y){
        if(body.contains(x,y)){
            return true;
        }
        if(wing1.contains(x,y)){
            return true;
        }
        if(wing2.contains(x,y)){
            return true;
        }
        if(tail.contains(x,y)){
            return true;
        }
        else return false;
    }
    public void setLocation(double x, double y){
        airX = x;
        airY = y;
        body.setLocation(x,y);
        wing1.setLocation(x-10,y+10);
        wing2.setLocation(x+60,y+10);
        tail.setLocation(x+33,y+15);
    }
    public double getX(){
        return airX;
    }
    public double getY(){
        return airY;
    }
    public void move(double x,double y){
        if(airX+x>1000){
            airX = 0;
        }
        if(airY+y>1000){
            airY = 0;
        }
        if(airX+x<0){
            airX = 1000;
        }
        if(airY+y<0){
            airY = 1000;
        }
        this.setLocation(airX+x,airX-y);
    }
}
