package SERLessons.Breakout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vishal Nigam
 * 4/26/18
 */
public class BallTimer extends Timer{
    private DrawingPanel panel;
    private int speed;
    public BallTimer(int s,DrawingPanel dp){
        super(s,null);
        speed = s;
        panel = dp;
        this.addActionListener(new TimerListener());
    }
    public void setSpeed(int x){
        speed = x;
        this.setDelay(speed);
    }
    private class TimerListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            panel.moveBall(5,5);
        }
    }
}
