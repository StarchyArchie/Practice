package SERLessons.Swingin.Smartshapes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Vishal Nigam
 * 4/12/18
 */
public class MoveButton extends JRadioButton{
    DrawingPanel _dp;
    int choice;
    Random rand;
    public MoveButton(String label, boolean option, DrawingPanel panel, int inC){
        super(label,option);
        choice = inC;
        _dp = panel;
        this.addActionListener(new ColorRadioButtonListener());
    }
    public int getChoice(){
        return choice;
    }
    private class ColorRadioButtonListener  implements ActionListener {

        public void actionPerformed(ActionEvent e)
        {
            _dp.changeState(choice);
        }
    }
}
