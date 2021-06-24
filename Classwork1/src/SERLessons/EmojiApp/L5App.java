package SERLessons.EmojiApp;

/**
 * Vishal Nigam
 * 2/6/18
 */
public class L5App extends wheels.users.Frame {
    private Emoji yellow;
    private Emoji red;
    public L5App(){
        yellow = new Emoji(3,2);
        red = new Emoji(java.awt.Color.red,100,100,"Angry");
    }
    public static void main(String[]args){
        L5App app = new L5App();
    }
}
