package SERLessons.Swingin.Sliders;
/*
 * Solution for Task 1 of Lab 7 - Spring 2010
 */

public class ColorEllipse extends ColorShape
{
    public ColorEllipse(java.awt.Color aBorderColor, 
			  java.awt.Color aFillColor){
	super(new java.awt.geom.Ellipse2D.Double());
	super.setBorderColor(aBorderColor);
	super.setFillColor(aFillColor);
	this.setLocation(100,100);
	this.setSize(50,50);
    }
}
