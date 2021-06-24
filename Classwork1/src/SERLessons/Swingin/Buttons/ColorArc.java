package SERLessons.Swingin.Buttons;

/**
 * Chapter 7.6*: alternative design for ColorArc
 */

public class ColorArc extends ColorShape
{
    public ColorArc(double x, double y, double w, double h, double start, double extent, int type,
            java.awt.Color aColor)
    {
        super(new java.awt.geom.Arc2D.Double(x, y, w, h, start, extent, type));
        this.setFillColor(aColor);
        this.setBorderColor(aColor);

    }
}
