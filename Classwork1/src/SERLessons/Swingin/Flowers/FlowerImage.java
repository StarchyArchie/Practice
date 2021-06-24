package SERLessons.Swingin.Flowers;

import java.awt.*;
//Vishal Nigam
public class FlowerImage
{
    java.awt.Point _location;
    java.awt.Image _fImage;

    public FlowerImage(java.awt.Image image, java.awt.Point loc)
    {
        _location = loc;
        _fImage = image;
    }

    public java.awt.Point getLoc()
    {
        return _location;
    }

    public int getX()
    {
        return _location.x;
    }

    public int getY()
    {
        return _location.y;
    }

    public java.awt.Image getImage()
    {
        return _fImage;
    }

    public void plant(Graphics g){
        g.drawImage(_fImage, getX(),getY(),null);
    }
}
