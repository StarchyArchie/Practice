package SERLessons.Breakout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Vishal Nigam
 * 4/26/18
 */
public class DrawingPanel extends JPanel {
    private Brick brick;
    private ArrayList<Brick> brickArray;
    private ArrayList<ImageBrick> imageArray;
    private ImageIcon icBrick;
    private boolean timerState, gameState;
    private JLabel scoreLabel;
    private Ball ball;
    private Paddle paddle, current, altPaddle;
    private int clickX,speed, score;
    private BallTimer timer;
    public DrawingPanel(){
        this.setBackground(Color.WHITE);
        this.setSize(900, 700);
        timerState = false;
        gameState = true;
        brickArray = new ArrayList<Brick>();
        imageArray = new ArrayList<ImageBrick>();
        scoreLabel = new JLabel("Score: "+0);
        speed = 50;//number of milliseconds between ticks of timer, variable added so it can be changed more transparently.
        icBrick = new ImageIcon("Classwork1/potoobrick.jpeg");
        diffSetup(0);
        brick = new Brick(0,0);
        brickArray.add(brick);
        ball = new Ball();
        paddle = new Paddle(500,650,this);
        altPaddle = new Paddle(200,650,this);
        current = paddle;
        timer = new BallTimer(speed,this);
        timer.setSpeed(speed);
        this.setFocusable(true);//allows keyboard to be accessed.
        //on mouse press, sets current paddle and gets x coordinate for use in moving said paddle.
        this.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                if(paddle.contains(e.getPoint())){
                    current = paddle;
                }
                else if(altPaddle.contains(e.getPoint())){
                    current = altPaddle;
                }
                clickX = e.getX();
            }
        });
        //Moves the selected paddle when mouse is dragged.
        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent mouseEvent) {
                super.mouseDragged(mouseEvent);
                    movePaddle((int)current.getX()+(mouseEvent.getX() - clickX));
                    clickX = mouseEvent.getX();
                }
        });
        //Class to allow paddle to be moved with arrow keys, for some reason,
        //ceases to function when timer begins. Otherwise works properly.
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent keyEvent) {
                System.out.println(keyEvent.getKeyCode());
                if(keyEvent.getKeyCode()==37){//left
                    movePaddle((int)paddle.getX()-10);
                }
                if(keyEvent.getKeyCode()==39){//right
                    movePaddle((int)paddle.getX()+10);
                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });
    }
    //Displays bricks and images mapped on top of them along with the ball and paddles.
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D brush = (Graphics2D) g;
        for(int i=0;i<brickArray.size();i++){
            brickArray.get(i).paint(brush);
        }
        for(int i=0; i<imageArray.size();i++){
            imageArray.get(i).paint(brush);
        }
        ball.paint(brush);
        paddle.paint(brush);
        altPaddle.paint(brush);
    }
    public void setScore(int x){
        score = x;
    }
    public int getScore(){
        return score;
    }
    public JLabel getScoreLabel(){
        return scoreLabel;
    }//Above and below are for purposes of changing the score on brick hits which occur in this class.
    public void setLabel(String s){
        scoreLabel.setText(s);
    }
    //Removes the bricks, resets the score and the ball, then displays game over.
    public void gameOver(){
        removeBricks();
        newBall();
        timer.stop();
        gameState = false;
        scoreLabel.setText("GAME OVER");
        score = 0;
        this.repaint();
    }
    public void resetGameState(){
        if(!gameState){
            gameState = true;
        }
    }
    //boolean for whether the game is currently active.
    public boolean getGameState(){
        return gameState;
    }
    //For ease of changing the state of the timer.
    public void timerSwitch(){
        if(timer.isRunning()){
            timer.stop();
            timerState = false;
        }
        else {
            timer.start();
            timerState = true;
        }
    }
    //to reset the ball from outside this class.
    public void newBall(){
        ball = new Ball();
    }
    public boolean timerIsRunning(){
        return timerState;
    }
    //Generates Bricks and images places them into two ArrayLists.
    public void arrayGen(int x, int z){
        int y = 0;
        for(int i=0;i<x;i++){
            brickArray.add(new Brick(y,z));
            imageArray.add(new ImageBrick(icBrick.getImage(),y,z));
            y+=53;
        }
    }
    //Function for three difficulty settings, changes number and layout of bricks.
    public void diffSetup(int x){
        if(x==0){
            arrayGen(17,0);
            arrayGen(17,50);
            arrayGen(17,100);
            arrayGen(17,150);
        }
        if(x==1){
            arrayGen(17,0);
            arrayGen(17,25);
            arrayGen(17,50);
            arrayGen(17,75);
            arrayGen(17,200);
            arrayGen(17,225);
            arrayGen(17,250);
            arrayGen(17,275);
        }
        if(x==2){
            arrayGen(17,0);
            arrayGen(17,25);
            arrayGen(17,50);
            arrayGen(17,75);
            arrayGen(17,100);
            arrayGen(17,125);
            arrayGen(17,150);
            arrayGen(17,175);
            arrayGen(17,200);
            arrayGen(17,225);
            arrayGen(17,250);
            arrayGen(17,275);
        }
    }
    //Empties the board of bricks, for both game over screen and difficulty reset.
    public void removeBricks(){
        brickArray = new ArrayList<Brick>();
        imageArray = new ArrayList<ImageBrick>();
    }
    public void setTimerSpeed(int x){
        timer.setSpeed(x);
    }
    //Move method for Ball
    public void moveBall(double x, double y){
        for(int i=0;i<brickArray.size();i++){
            if(brickArray.get(i).intersects(ball.getBounds2D())){
                if(ball.getCenterX()>brickArray.get(i).getX()+brickArray.get(i).getWidth()&&ball.getCenterY()>brickArray.get(i).getY()-5){
                    ball.setCheckX();
                }
                if(ball.getCenterX()<brickArray.get(i).getX()&&ball.getCenterY()>brickArray.get(i).getY()-5){
                    ball.setCheckX();
                }
                if(ball.getCenterY()>brickArray.get(i).getY()&&ball.getCenterX()>brickArray.get(i).getX()&&ball.getCenterX()<brickArray.get(i).getX()+brickArray.get(i).getWidth()){
                    ball.setCheckY();
                }
                if(ball.getCenterY()<brickArray.get(i).getY()+brickArray.get(i).getHeight()&&ball.getCenterX()>brickArray.get(i).getX()&&ball.getCenterX()<brickArray.get(i).getX()+brickArray.get(i).getWidth()){
                    ball.setCheckY();
                }
                brickArray.remove(i);
                imageArray.remove(i);
                score+=10;
                scoreLabel.setText("Score: "+score);
            }
            if(ball.getCenterY()>675){
                gameOver();
            }
        }
        if(ball.getCenterY()>current.getY()&&ball.getCenterX()>current.getX()&&ball.getCenterX()<current.getX()+current.getWidth()){
            ball.setCheckY();
        }
        ball.move(x,y);
        this.repaint();
    }
    //Move method for Paddle
    public void movePaddle(int x){
        current.move(x);
        this.repaint();
    }
}
