package SERLessons.Swingin.StartNGo;

import javax.swing.*;

/**
 * Vishal Nigam
 * 4/6/18
 */
public class ButtonPanel extends JPanel{
    public ButtonPanel() {
        JLabel label = new JLabel("Go Bobcats :)");
        JButton button = new JButton("Start");
        Timer timer = new Timer(500,null);
        //timer.start();
        this.add(label);
        this.add(button);
        button.addActionListener(new ButtonListener(label, button, timer));

    }
}
