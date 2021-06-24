package SERLessons.Wagon; /**
 * Vishal Nigam
 * 2/20/18
 */
import wheels.users.*;
public class MyApp extends Frame {
    private Wagon _myWagon;
    private DraggableEllipse _sun;
    private ConversationBubble _conv;
    public MyApp(){
        _myWagon = new Wagon();

        //_myWagon2.setLocation(250, 250);
        _sun = new DraggableEllipse(java.awt.Color.blue,_myWagon);
        _sun.setSize(70, 70);
        _sun.setLocation(400, 40);

        _conv = new ConversationBubble("Where are we going?");



    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new MyApp();
    }
}
