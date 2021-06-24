package SERLessons.EmojiApp;

import SERLessons.EmojiApp.Emoji;
import wheels.users.ConversationBubble;

import java.awt.event.MouseEvent;

/**
 * Vishal Nigam
 * 2/13/18
 */
public class Talkative extends Emoji {
    public ConversationBubble bubble;
    public Talkative(int x, int y){
        super(x,y);
        bubble = new ConversationBubble("Memes");
    }
    public void mousePressed(MouseEvent e){
        bubble.hide();
    }
    public void mouseReleased(MouseEvent e){
        bubble.show();
    }
}
