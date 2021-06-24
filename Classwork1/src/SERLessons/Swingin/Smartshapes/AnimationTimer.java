package SERLessons.Swingin.Smartshapes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Vishal Nigam
 * 4/12/18
 */
public class AnimationTimer extends Timer{
    private DrawingPanel _panel;
    private Aircraft a;
    int choice, randx,randy,pos;
    Random rand;
    public AnimationTimer(DrawingPanel panel,int C){
        super(100,null);
        _panel = panel;
        choice = C;
        this.addActionListener(new MoveListener());
    }
    public void setChoice(int x){
        choice = x;
    }
    private class MoveListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if(choice==0||choice==1){
                rand = new Random();
                randx = rand.nextInt(25);
                randy = rand.nextInt(25);
                pos = rand.nextInt(4);

                //_panel.move((double)randx,(double)-randy);
                if (pos == 0) { _panel.move(5., -5.); }
                if (pos == 1) { _panel.move(10., 10.); }
                if (pos == 2) { _panel.move(-10., -10.); }
                if (pos == 3) { _panel.move(-5., 5.); }
            }
            else if(choice==2){
                _panel.move(0.,0.);
            }
            if(choice==1){
                _panel.follow();
            }
        }
    }
}
