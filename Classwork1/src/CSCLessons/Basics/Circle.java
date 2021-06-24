package CSCLessons.Basics;/*
 * Zach Kohlberg
 *
 * Represents a circle on a 2D plane
 */

public class Circle
{
    //Instance variables
    private double x, y, radius;

    //Constructor
    public Circle(double cx, double cy, double cr)
    {
        x = cx;
        y = cy;
        radius = cr;
    }

    //Instance methods

    //Getters and setters
    public double getX()
    {
        return x;
    }

    public void setX(double cx)
    {
        x = cx;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double cy)
    {
        y = cy;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double cr)
    {
        radius = cr;
    }

    //Returns whether this circle is intersecting other
    public boolean isIntersecting(Circle other)
    {
        return distanceTo(other) <= radius + other.getRadius();
    }

    //Returns the distance between this circle's center and other's center
    public double distanceTo(Circle other)
    {
        return Math.sqrt(Math.pow(x - other.getX(), 2) + Math.pow(y - other.getY(), 2));
    }

    //Returns this circle's area
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    //Returns this circle's circumference
    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }
}

