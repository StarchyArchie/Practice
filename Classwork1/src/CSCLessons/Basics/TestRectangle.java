package CSCLessons.Basics; /**
 * Vishal Nigam
 * 1/30/18
 * Tests the "Rectangle" class
 */

public class TestRectangle {

    public static void main(String[]args){

        //test zero parameter constructor and length+width getters
        System.out.println("Test zero parameter constructor and length+width getters");
        Rectangle rec1 = new Rectangle();
        System.out.print("Length: "+rec1.getLength());
        System.out.println(" Width: "+rec1.getWidth());

        //test length and width setters
        System.out.println("Test length and width setters");
        rec1.setLength(5.9);
        rec1.setWidth(6.5);
        System.out.print("Length: "+rec1.getLength());
        System.out.println(" Width: "+rec1.getWidth());

        //test the two parameter constructor
        System.out.println("Test two parameter constructor");
        Rectangle rec2 = new Rectangle(40.1,55.2);
        System.out.print("Length: "+rec2.getLength());
        System.out.println(" Width: "+rec2.getWidth());

        //test area and perimeter methods
        System.out.println("Test area and perimeter methods");
        System.out.print("area: "+rec2.calcArea());
        System.out.println(" perimeter: "+rec2.calcPer());

    }
}
