package SERLessons.WheelsBasic; /**
 * Vishal Nigam
 * 2/2/18
 * Rectangle in a frame.
 */
import wheels.users.*;

public class FirstAppWithRectangle extends Frame {
    private Rectangle rectangle;
    public FirstAppWithRectangle(){
        rectangle = new Rectangle();
    }
    public static void main(String[]args){
        FirstAppWithRectangle app = new FirstAppWithRectangle();
    }
}
