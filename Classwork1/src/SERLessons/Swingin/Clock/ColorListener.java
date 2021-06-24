package SERLessons.Swingin.Clock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Vishal Nigam
 * 3/29/18
 */
public class ColorListener implements ActionListener{
    private JLabel _label;
    public ColorListener(JLabel label){
        _label = label;
    }
    public void actionPerformed(ActionEvent e){
        long currTime = System.currentTimeMillis();
        Date now = new Date(currTime);
        _label.setText(now.toString());
        int red = (int) (Math.random()*256);
        int green = (int) (Math.random()*256);
        int blue = (int) (Math.random()*256);
        Color random = new Color(red,green,blue);
        _label.setForeground(random);
    }
}
