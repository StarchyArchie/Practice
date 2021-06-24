package SERLessons.Swingin.Sliders;
/**
 * MoverSlider changes the location of the shape depending on direction
 */

import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MoverSlider extends JSlider {

	private DrawingPanel _dp;
	private int _direction;
	private JLabel _label;
	
	public MoverSlider(int min, int max, DrawingPanel dp, int orientation,int dir, JLabel label) {
		super(orientation,min,max,100);
        _dp = dp;
        _label = label;
        _direction = dir;
        this.addChangeListener(new MoverListner());
	}
	
	private class MoverListner implements ChangeListener{

	   	
		public void stateChanged(ChangeEvent e) {
            if(_direction==1){
                _dp.move(getValue(),0);
                _label.setText("X = "+getValue());
            }
            else{
                _dp.move(0,getValue());
                _label.setText("Y = "+getValue());
            }
		}
		
	}
}
