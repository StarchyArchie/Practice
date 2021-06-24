package SERLessons.Breakout;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Vishal Nigam
 * 4/26/18
 */
public class Breakout extends JFrame {
    private DrawingPanel dp;
    private JLabel sliderLabel, scoreLabel;
    private JButton quit, start;
    private JRadioButton easy, normal, hard;
    private ButtonGroup diff;
    private JSlider diffSlider;
    private JPanel controls;
    public Breakout(){
        super("BREAKOUT!");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        dp = new DrawingPanel();
        controls = new JPanel();
        diff = new ButtonGroup();
        easy = new JRadioButton("Easy",true);//sets radio button to be default active and with label "Easy."
        normal = new JRadioButton("Normal");
        hard = new JRadioButton("Hard");
        diff.add(easy);//adds difficulty radio buttons to a button group so they are mutually exclusive.
        diff.add(normal);
        diff.add(hard);
        dp.setScore(0);//sets default score to 0.
        this.setSize(900,900);
        this.setLayout(new BorderLayout());
        this.add(dp, BorderLayout.CENTER);//places Drawing panel in center of frame.
        this.add(controls,BorderLayout.SOUTH);//places control panel below drawing panel.
        quit = new JButton("QUIT");
        start = new JButton("START");
        diffSlider = new JSlider(1,100,50);//creates a JSlider with min value of 1, max value of 100, and a starting point of 50.
        sliderLabel = new JLabel("Difficulty: Normal");
        scoreLabel = dp.getScoreLabel();//new JLabel("Score: "+dp.getScore());
        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });//sets "QUIT" button to exit the program.
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {//Swaps start button for pause button when pressed.
                dp.timerSwitch();
                if (start.getText().equals("START")) {
                    start.setText("PAUSE");
                } else start.setText("START");
            }
        });
        diffSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                dp.setTimerSpeed(diffSlider.getValue());//changes label on slider in tandem with low interval on the timer.
                if (diffSlider.getValue() < 30) {
                    sliderLabel.setText("Difficulty: Hard");
                }
                if (diffSlider.getValue() > 30 && diffSlider.getValue() < 70) {
                    sliderLabel.setText("Difficulty: Normal");
                }
                if (diffSlider.getValue() > 70) {
                    sliderLabel.setText("Difficulty: Easy");
                }
            }
        });
        easy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dp.newBall();
                if(dp.timerIsRunning()){
                    dp.timerSwitch();
                    start.setText("START");
                }
                dp.resetGameState();
                dp.setScore(0);
                dp.setLabel("Score: " + dp.getScore());
                dp.removeBricks();
                dp.diffSetup(0);
                dp.repaint();
            }

        });
        normal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dp.newBall();
                if(dp.timerIsRunning()){
                    dp.timerSwitch();
                    start.setText("START");
                }
                dp.resetGameState();
                dp.setScore(0);
                dp.setLabel("Score: " + dp.getScore());
                dp.removeBricks();
                dp.diffSetup(1);
                dp.repaint();
            }

        });
        hard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dp.newBall();
                if(dp.timerIsRunning()){
                    dp.timerSwitch();
                    start.setText("START");
                }
                dp.resetGameState();
                dp.setScore(0);
                dp.setLabel("Score: " + dp.getScore());
                dp.removeBricks();
                dp.diffSetup(2);
                dp.repaint();
            }

        });
        //adds the buttons, slider, and score to the control panel.
        controls.add(quit);
        controls.add(start);
        controls.add(diffSlider);
        controls.add(sliderLabel);
        controls.add(easy);
        controls.add(normal);
        controls.add(hard);
        controls.add(scoreLabel);
        this.setVisible(true);
    }
    public static void main(String[]args){
        new Breakout();
    }
}
