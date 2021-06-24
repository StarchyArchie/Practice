package CSCLessons.Basics;/*
 * Vishal Nigam
 *
 * Prints relations of three circles generated through user input, their combined area,
 * and the largest circle along with it's circumference.
 */

import java.util.Scanner;

public class CircleMath
{
    private static void maxCirc(String x, double y ){
        double z = y*100.0;//increases y by 2 decimals
        double r = Math.round(z);//rounds y to a whole number
        double fin = r/100.00;//returns decimals to original location
        System.out.println("The largest circle is "+x+ ", with a circumference of "+fin+".");
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //Prompt user for a circle
        System.out.println("Enter the coordinates of circle A.");
        double xA = input.nextDouble();
        double yA = input.nextDouble();
        System.out.println("Enter the radius of circle A.");
        double rA = input.nextDouble();

        System.out.println("Enter the coordinates of circle B.");
        double xB = input.nextDouble();
        double yB = input.nextDouble();
        System.out.println("Enter the radius of circle B.");
        double rB = input.nextDouble();

        System.out.println("Enter the coordinates of circle C.");
        double xC = input.nextDouble();
        double yC = input.nextDouble();
        System.out.println("Enter the radius of circle C.");
        double rC = input.nextDouble();

        //Create three circles
        Circle a = new Circle(xA, yA, rA);
        Circle b = new Circle(xB, yB, rB);
        Circle c = new Circle(xC, yC, rC);

        //Print whether a and b are intersecting
        boolean intAB = a.isIntersecting(b);
        boolean intAC = a.isIntersecting(c);
        boolean intBC = b.isIntersecting(c);


        if (intAB){
            System.out.println("A and B are intersecting.");
        }
        else {System.out.println("A and B are not intersecting.");}

        if (intAC){
            System.out.println("A and C are intersecting.");
        }
        else {System.out.println("A and C are not intersecting.");}

        if (intBC){
            System.out.println("B and C are intersecting.");
        }
        else {System.out.println("B and C are not intersecting.");}

        double areaA = a.getArea();//Area of A
        double areaB = b.getArea();//Area of B
        double areaC = c.getArea();//Area of C
        double areaTotal = areaA + areaB + areaC;
        double at1 = areaTotal*100;
        double at2 = Math.round(at1);
        double atFin = at2/100.00;

        System.out.println("The total area of A, B, and C is "+atFin+".");

        double cirA = a.getCircumference();
        double cirB = b.getCircumference();
        double cirC = c.getCircumference();

        if (cirA<cirB){
            if (cirB<cirC){
                    maxCirc("C",cirC);
                }
            else {maxCirc("B",cirB);}
        }
        else if (cirA<cirC){
            maxCirc("C",cirC);
        }
        else {maxCirc("A",cirA);}
    }
}

