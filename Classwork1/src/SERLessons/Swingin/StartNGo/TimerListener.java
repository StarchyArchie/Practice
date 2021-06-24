package SERLessons.Swingin.StartNGo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vishal Nigam
 * 4/6/18
 */
public class TimerListener implements ActionListener{
    private JLabel label;
    public TimerListener(JLabel lab){
        label = lab;
    }
    public void actionPerformed(ActionEvent e){
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        Color random = new Color(red, green, blue);
        label.setForeground(random);
    }
}
