package SERLessons.Swingin.Clock;

import java.awt.*;
import java.awt.geom.*;

/**
 * Vishal Nigam
 * 3/20/18
 */
public abstract class ColorShape {
    private RectangularShape _shape;
    private Color border, fill;
    private double rotation;
    public ColorShape(RectangularShape s){
        _shape = s;
    }
    public Color getBorder() {
        return border;
    }

    public void setBorder(Color border) {
        this.border = border;
    }

    public Color getFill() {
        return fill;
    }

    public void setFill(Color fill) {
        this.fill = fill;
    }

    public double getRotation() {
        return (rotation*180)/Math.PI;
    }

    public void setRotation(double rotationDegrees) {
        this.rotation = (rotationDegrees*Math.PI)/180;
    }

    //setLocation
    public void setLocation(double x, double y){
        _shape.setFrame(x,y,_shape.getWidth(),_shape.getHeight());
    }
    //setSize
    public void setSize(double w, double h){
        _shape.setFrame(_shape.getX(),_shape.getY(),w,h);
    }
    public double getX(){
        return _shape.getX();
    }
    public double getY(){
        return _shape.getY();
    }
    public double getWidth(){
        return _shape.getWidth();
    }
    public double getHeight(){
        return _shape.getHeight();
    }
    public void paint(Graphics2D brush){
        brush.setColor(border);
        System.out.print(rotation);
        brush.rotate(rotation,_shape.getCenterX(),_shape.getCenterY());
        brush.draw(_shape);
        brush.setColor(fill);
        brush.fill(_shape);
        brush.rotate(0-rotation,_shape.getCenterX(),_shape.getCenterY());
    }
    public void setColor(Color c,Color d){
        border = c;
        fill = d;
    }
}
