package CSCLessons.Basics; /**
 * Vishal Nigam
 * 1/30/18
 * Creates a rectangle given Length and Width, and calculates area and perimeter.
 */
import java.util.Scanner;

public class Rectangle {

    //Instance variables

    private double length;
    private double width;
    private double area;
    private double perimeter;
    private final double DEFAULT_LENGTH = 1.0;
    private final double DEFAULT_WIDTH = 4.0;

    //Constructors

    public Rectangle(){//Generates object "Rectangle" with default dimensions
        length = DEFAULT_LENGTH;
        width = DEFAULT_WIDTH;
    }

    public Rectangle(double l,double w){//Generates object "Rectangle" with given dimensions
        length = l;
        width = w;
    }

    //Instance methods

    public double getLength(){//Returns length
        return length;
    }

    public void setLength(double x){//Sets length to given parameter
        length = x;
    }

    public double getArea(){//Returns area
        return area;
    }

    public void setWidth(double x){//Sets width to given parameter
        width = x;
    }

    public double getWidth(){//Returns width
        return width;
    }

    public double getPerimeter(){//Returns perimeter
        return perimeter;
    }

    public double calcArea(){//Calculates area
       return length*width;
    }

    public double calcPer(){//Calculates perimeter
        return((length*2)+(width*2));
    }
}
