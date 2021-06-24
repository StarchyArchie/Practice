package SERLessons.WormApp; /**
 * Generates image of a worm in 2 alternating colors.
 * 
 * Vishal Nigam
 */
import wheels.users.*;
import java.awt.Color;
public class MyApp extends Frame
{
    private Worm _aWorm;

	public MyApp() {
		_aWorm = new Worm(Color.magenta, Color.cyan);
	}

	public static void main(String [] args) {
	    MyApp app = new MyApp();
	}

}
