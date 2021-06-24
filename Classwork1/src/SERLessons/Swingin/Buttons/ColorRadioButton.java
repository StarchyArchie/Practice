package SERLessons.Swingin.Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorRadioButton extends JRadioButton
{
    private DrawingPanel _dp;
    private Color _buttonColor;

    public ColorRadioButton(String lbl, boolean option, Color c, DrawingPanel dp)
    {
        super(lbl, option);
        _dp = dp;
        _buttonColor = c;
        this.addActionListener(new ColorRadioButtonListener());
    }

    /******
     * IMPORTANT NOTE: private classes have direct access to outer class instance
     * variable ColorRadioButton can directly use _dp and _buttonColor
     *****/
    private class ColorRadioButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            _dp.setShapeColor(_buttonColor);
            _dp.repaint();
        }
    }
}
