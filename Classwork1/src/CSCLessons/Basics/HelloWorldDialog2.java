package CSCLessons.Basics; /**
 * Vishal Nigam
 * 1/26/18
 * Greeting using user input in a text box
 */
import javax.swing.JOptionPane;
public class HelloWorldDialog2 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello " + name + "!!!");
    }
}
