package SERLessons.Breakout;

import java.awt.*;

/**
 * Vishal Nigam
 * 5/3/18
 */
public class ImageBrick {
    int xloc, yloc;
    java.awt.Image image;
    //Constructor which passes an image and x,y coordinates for purposes of displaying it.
    public ImageBrick(java.awt.Image i, int x, int y)
    {
        xloc = x;
        yloc = y;
        image = i;
    }
    public int getX()
    {
        return xloc;
    }

    public int getY()
    {
        return yloc;
    }

    public java.awt.Image getImage()
    {
        return image;
    }

    public void paint(Graphics g){
        g.drawImage(image, getX(),getY(),null);
    }
}
