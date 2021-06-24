package SERLessons.WormApp;

import wheels.users.Ellipse;

import java.awt.event.MouseEvent;
import java.awt.Color;
/**
 * Vishal Nigam
 * 2/16/18
 */
public class ClickableEllipse extends Ellipse{
    Color mai,alt;
    int temp;
    public void mouseClicked(MouseEvent e){
        if (temp%2 == 0){
            setColor(alt);
        }
        else{
            setColor(mai);
        }
        temp++;
    }
    public ClickableEllipse(Color c, Color e){
        mai = c;
        alt = e;
        setColor(mai);
    }

}
