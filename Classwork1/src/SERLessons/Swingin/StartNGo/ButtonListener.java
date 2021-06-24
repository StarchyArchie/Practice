package SERLessons.Swingin.StartNGo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vishal Nigam
 * 4/6/18
 */
public class ButtonListener implements ActionListener{
    private JLabel label;
    private JButton button;
    private Timer timer;// = new Timer(500,this);
    public ButtonListener(JLabel lab, JButton b, Timer time){
        label = lab;
        button = b;
        timer = time;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(button.getText().equals("Start")&&!timer.isRunning()) {
            timer.start();
            timer.addActionListener(new TimerListener(label));
            button.setText("Stop");
        }
        else{
            timer.stop();
            button.setText("Start");
        }
    }
}
