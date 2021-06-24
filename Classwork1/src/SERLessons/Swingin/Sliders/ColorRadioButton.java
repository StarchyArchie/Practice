package SERLessons.Swingin.Sliders;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorRadioButton extends JRadioButton
{
	 DrawingPanel _dp;
	 Color _buttonColor;
     public ColorRadioButton(String label, boolean option,Color c, DrawingPanel panel, ButtonGroup bg){
         super(label,option);
         _dp = panel;
         _buttonColor = c;
         bg.add(this);
         this.addActionListener(new ColorRadioButtonListener());
    }
	private class ColorRadioButtonListener  implements ActionListener {

		public void actionPerformed(ActionEvent e)
		{
            _dp.setShapeColor(_buttonColor);

		}
	}
}
