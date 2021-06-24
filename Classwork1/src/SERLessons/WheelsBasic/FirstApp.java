package SERLessons.WheelsBasic; /**
 * Vishal Nigam
 * 2/2/18
 * Wheels example
 */
import wheels.users.*;

public class FirstApp extends Frame {

    private Ellipse ellipse;
    private ConversationBubble bubble;

    public FirstApp(){
        ellipse = new Ellipse();
        bubble = new ConversationBubble("Howdy");
    }

    public static void main(String[]args){
        FirstApp app = new FirstApp();
    }
}
