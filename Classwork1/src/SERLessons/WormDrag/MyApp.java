package SERLessons.WormDrag;
/**
 * Write a description of class MyApp here.
 * 
 * Vishal Nigam
 * @version (a version number or a date)
 */
import wheels.users.*;
public class MyApp extends Frame
{
    private Worm _aWorm;

	public MyApp() {
		_aWorm = new Worm(java.awt.Color.green,java.awt.Color.blue);
		_aWorm.setLocation(200,100);
	}

	public static void main(String [] args) {
	    MyApp app = new MyApp();
	}

}
