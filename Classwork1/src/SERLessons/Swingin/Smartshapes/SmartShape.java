package SERLessons.Swingin.Smartshapes;

import java.awt.*;
import java.awt.geom.RectangularShape;

public class SmartShape {
    private RectangularShape _s;
    private Color _fillColor, _borderColor;
    private double _rotation;
    private Aircraft air;
    private AirProxy proxy;

    public SmartShape(RectangularShape s) {
        _s = s;
        _fillColor = Color.red;
        _borderColor = Color.red;
        setLocation(250, 225);
        setSize(100, 100);
    }

    public SmartShape(RectangularShape s, int x, int y, int sizeX, int sizeY, Aircraft a, AirProxy current) {
        air = a;
        proxy = current;
        _s = s;
        _fillColor = Color.red;
        _borderColor = Color.red;
        setLocation(x, y);
        setSize(sizeX, sizeY);
    }

    public boolean contains(int x, int y) {
        Point p = new Point(x, y);
        if (_s.contains(p)) {
            return true;
        } else return false;
    }

    public void setLocation(double x, double y) {
        _s.setFrame(x, y, _s.getWidth(), _s.getHeight());
    }

    public void setSize(double w, double h) {
        _s.setFrame(_s.getX(), _s.getY(), w, h);
    }

    public void setColor(Color c) {
        _fillColor = c;
        _borderColor = c;
    }

    public void setFillColor(Color c) {
        _borderColor = c;
    }

    public void setBorderColor(Color c) {
        _fillColor = c;
    }

    public Color getFillColor() {
        return _fillColor;
    }

    public Color getBorderColor() {
        return _borderColor;
    }

    public void setRotation(double degrees) {
        _rotation = degrees * Math.PI / 180;
    }

    public double getRotation() {
        return _rotation * 180 / Math.PI;
    }

    public void paint(Graphics2D brush) {
        brush.rotate(_rotation, _s.getCenterX(), _s.getCenterY());
        //Try changing the order in which the border and fill are painted
        brush.setColor(_borderColor);
        brush.draw(_s);
        brush.setColor(_fillColor);
        brush.fill(_s);
        brush.rotate(-_rotation, _s.getCenterX(), _s.getCenterY());
    }
}