package SERLessons.Alien;

import wheels.users.ConversationBubble;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Vishal Nigam
 * 2/22/18
 */
public class ClickBubble extends ConversationBubble {
    private Color mai, alt;
    private int temp;
    private Body body;
    public void mouseClicked(MouseEvent e) {
        if (temp % 2 == 0) {
            body.bodyColor(alt, mai);
        } else {
            body.bodyColor(mai, alt);
        }
        temp++;
    }
    public ClickBubble(String txt,Color c, Color e, Body bod){
        super(txt);
        body = bod;
        mai = c;
        alt = e;
    }
}
