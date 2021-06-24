package SERLessons.Swingin.BallMove;

/**
 * Chapter 7: BallApp.java Displays a blank window.
 * Vishal Nigam
 */
public class BallApp extends javax.swing.JFrame
{
    public BallApp(String title)
    {
        super(title);
        this.setSize(600, 450);
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        this.add(new BallPanel());
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        BallApp app = new BallApp("This is a JFrame!");
    }
}
