package SERLessons.WormApp; /**
 * Vishal Nigam
 * 2/16/18
 */
import wheels.users.Frame;

import java.awt.*;

public class TestClickableEllipse extends Frame{
    private ClickableEllipse ellipse;
    public TestClickableEllipse(){
        ellipse = new ClickableEllipse(Color.blue, Color.green);

    }
    public static void main(String[]args){
        TestClickableEllipse app = new TestClickableEllipse();
    }
}
