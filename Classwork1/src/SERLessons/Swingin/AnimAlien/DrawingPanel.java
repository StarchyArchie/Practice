package SERLessons.Swingin.AnimAlien;

import SERLessons.Swingin.Clock.ColorEllipse;

import java.awt.*;

/**
 * Vishal Nigam
 * 3/22/18
 */
public class DrawingPanel extends javax.swing.JPanel{
    private ColorEllipse ellipse;
    private NiceAlien alien;
    private EvilAlien adversary;
    private AnimationTimer timer;
    //override PaintComponent
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D brush = (Graphics2D)g;
        alien.paint(brush);
        adversary.paint(brush);
        ellipse.paint(brush);
    }
    public DrawingPanel(){
        super();
        this.setSize(500,450);
        this.setPreferredSize(new Dimension(500,400));
        this.setBackground(Color.cyan);
        ellipse = new ColorEllipse();
        alien = new NiceAlien(300,300,Color.black,Color.red);
        adversary = new EvilAlien(100,300,Color.pink, Color.green);
        timer = new AnimationTimer(this);
        timer.start();
    }
    public void move(){
        alien.move(5,0);
        this.repaint();
    }
}
