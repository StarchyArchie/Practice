package SERLessons.Swingin.AnimAlien;

import java.awt.*;

/**
 * Vishal Nigam
 * 3/27/18
 */
public class EvilAlien extends NiceAlien{
    public EvilAlien(int x, int y, Color c, Color d){
        super(x,y,c,d);
        leye.setRotation(-33.0);
        reye.setRotation(33.0);
    }
}
