package SERLessons.Swingin.AnimAlien;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vishal Nigam
 * 3/27/18
 */
public class AnimationTimer extends Timer{
    private DrawingPanel _panel;
    public AnimationTimer(DrawingPanel panel){
        super(100,null);
        _panel = panel;
        this.addActionListener(new MoveListener());
    }
    private class MoveListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            _panel.move();
        }
    }
}
