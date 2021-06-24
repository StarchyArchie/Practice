package SERLessons.Swingin.Clock;

import java.awt.geom.Ellipse2D;
import java.awt.*;

/**
 * Vishal Nigam
 * 3/22/18
 */
public class ColorEllipse extends ColorShape{

    public ColorEllipse() {
        super(new Ellipse2D.Double());
        this.setFill(Color.yellow);
        this.setBorder(Color.yellow);
        this.setLocation(150,150);
        this.setSize(50,50);
    }
}
