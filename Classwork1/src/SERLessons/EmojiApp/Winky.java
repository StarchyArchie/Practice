package SERLessons.EmojiApp;

import SERLessons.EmojiApp.Emoji;

import java.awt.event.MouseEvent;

/**
 * Vishal Nigam
 * 2/13/18
 */
public class Winky extends Emoji {
    public Winky(int x, int y){
    super(x,y);
    }
    public void mousePressed(MouseEvent e){

        leftEye.setSize(30,5);
        leftEye.setLocation(leftEye.getXLocation(),leftEye.getYLocation()+15);
    }
    public void mouseReleased(MouseEvent e){

        leftEye.setSize(30,30);
        leftEye.setLocation(leftEye.getXLocation(),leftEye.getYLocation()-15);
    }
}
