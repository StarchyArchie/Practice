package SERLessons.Swingin.Clock;

import javax.swing.*;
import java.awt.*;

/**
 * Vishal Nigam
 * 3/29/18
 */
public class ColorTextPanel extends JPanel{
    public ColorTextPanel(){
        JLabel label = new JLabel("Don't Let Your Memes Be Dreams");
        JButton button = new JButton("Fabulize!");
        Timer timer = new Timer(1000,new ColorListener(label));
        timer.start();
        //set the default size of panel
        this.setPreferredSize(new Dimension(250,75));
        //add label and button to panel
        this.add(label);
        this.add(button);
        button.addActionListener(new ColorListener(label));
    }
}
