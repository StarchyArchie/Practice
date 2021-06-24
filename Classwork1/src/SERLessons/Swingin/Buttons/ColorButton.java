package SERLessons.Swingin.Buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vishal Nigam
 * 4/13/18
 */
public class ColorButton extends JButton{
    private DrawingPanel panel;
    private int type;
    private String name;
    ColorButton(String n, int x,DrawingPanel dp){
        super(n);
        type = x;
        panel = dp;
        this.addActionListener(new buttonListener());
    }
    private class buttonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            panel.setTypeOfShape(type);
            panel.repaint();
        }
    }
}
