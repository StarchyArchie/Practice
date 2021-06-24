package SERLessons.WormApp;

import wheels.users.Ellipse;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Vishal Nigam
 * 2/16/18
 */
public class ClickableEllipseBody extends Ellipse{
    Color mai,alt;
    int temp;
    Body body;

    public void mouseClicked(MouseEvent e){
        if (temp%2 == 0){
            body.setBod(alt);
        }
        else{
            body.setBod(mai);
        }
        temp++;
    }
    public ClickableEllipseBody(Color c, Color e,Body bod){
        mai = c;
        alt = e;
        body = bod;
        setColor(mai);

    }

}
