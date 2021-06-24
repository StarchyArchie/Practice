package SERLessons.Swingin.BallMove;

import java.awt.event.*;

/**
 * Chapter 7: BallPanel.java Creates the panel to be placed inside the BallApp
 * window. Used (with modifications) in all programs later in this book. Version
 * 3 of 3
 * Vishal Nigam
 */
public class BallPanel extends javax.swing.JPanel {
    private final int INIT_X = 75;
    private final int INIT_Y = 75;
    private final int DIAMETER = 60;
    private SmartEllipse _ball;
    private int ballX, ballY;

    public BallPanel() {
        super();
        MListener listen = new MListener();
        this.setBackground(java.awt.Color.white);
        this.setFocusable(true);
        _ball = new SmartEllipse(java.awt.Color.red);
        _ball.setLocation(INIT_X, INIT_Y);
        ballX = INIT_X;
        ballY = INIT_Y;
        _ball.setSize(DIAMETER, DIAMETER);
        this.addMouseListener(listen);
        this.addMouseMotionListener(listen);
        this.addKeyListener(listen);
        // The ball panel needs to add a new MouseListener, KeyListener, and
        // MouseMotionListener in its constructor. To receive key events, it must also
        // be focusable.
    }

    public void paintComponent(java.awt.Graphics aBrush) {
        super.paintComponent(aBrush);
        java.awt.Graphics2D betterBrush = (java.awt.Graphics2D) aBrush;
        _ball.fill(betterBrush);
    }

    private void moveBall(double x, double y) {
        _ball.setLocation(_ball.getX()-x, _ball.getY()-y);
        this.repaint();
    }

    private class MListener implements MouseListener, MouseMotionListener, KeyListener {
        double locX, locY;

        @Override
        public void mouseClicked(MouseEvent mouseEvent) {

        }

        @Override
        public void mousePressed(MouseEvent mouseEvent) {
            if (_ball.contains(mouseEvent.getPoint())) {
                locX = mouseEvent.getX();
                locY = mouseEvent.getY();
            }
        }

        @Override
        public void mouseReleased(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseEntered(MouseEvent mouseEvent) {

        }

        @Override
        public void mouseExited(MouseEvent mouseEvent) {

        }

        @Override
        public void keyTyped(KeyEvent keyEvent) {

        }

        @Override
        public void keyPressed(KeyEvent keyEvent) {
            if(keyEvent.getKeyCode()==38){
                moveBall(0,5);
            }
            if(keyEvent.getKeyCode()==40){
                moveBall(0,-5);
            }
            if(keyEvent.getKeyCode()==37){
                moveBall(5,0);
            }
            if(keyEvent.getKeyCode()==39){
                moveBall(-5,0);
            }
        }

        @Override
        public void keyReleased(KeyEvent keyEvent) {

        }

        @Override
        public void mouseDragged(MouseEvent mouseEvent) {
            if(_ball.contains(mouseEvent.getPoint())) {
                double x = mouseEvent.getX(), y = mouseEvent.getY();
                moveBall(locX - x, locY - y);
                locX = mouseEvent.getX();
                locY = mouseEvent.getY();
            }
        }

        @Override
        public void mouseMoved(MouseEvent mouseEvent) {

        }
    }
}
