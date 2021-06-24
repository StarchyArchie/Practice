package SERLessons.Swingin.Smartshapes;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class DrawingPanel extends JPanel {
	//private SmartShape _rectangle;
    private Aircraft aircraft, follower1, follower2;
    private AnimationTimer Timer;
    private AirProxy current;

	public DrawingPanel() {
		super(new BorderLayout());
		this.setSize(1000, 1000);
		this.setBackground(Color.white);
        aircraft = new Aircraft(250,225,100,100, Color.BLACK, Color.GREEN);
        follower1 = new Aircraft(100,125,70,70,Color.gray,Color.YELLOW);
        follower2 = new Aircraft(350,325,70,70,Color.gray,Color.YELLOW);
        current = aircraft.current;
        this.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                if(aircraft.contains(e.getX(),e.getY())){
                    current.setAir(aircraft);
                }
                else if(follower1.contains(e.getX(),e.getY())){
                    current.setAir(follower1);
                }
                else if(follower2.contains(e.getX(),e.getY())){
                    current.setAir(follower2);
                }
            }
        });
        Timer = new AnimationTimer(this,0);
        Timer.start();
	}
    public void changeState(int choice){
        Timer.setChoice(choice);
    }
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D brush = (Graphics2D) g; // local variable of type Grahics2D
        aircraft.wing1.paint(brush);
        aircraft.wing2.paint(brush);
        aircraft.body.paint(brush);
        aircraft.tail.paint(brush);
        follower1.wing1.paint(brush);
        follower1.wing2.paint(brush);
        follower1.body.paint(brush);
        follower1.tail.paint(brush);
        follower2.wing1.paint(brush);
        follower2.wing2.paint(brush);
        follower2.body.paint(brush);
        follower2.tail.paint(brush);
	}

    public void move(double x,double y){
        Aircraft cur = current.getAir();
        cur.move(x, y);
        this.repaint();
    }
    public void stop(){
        Timer.stop();
    }
    public void follow(){
        double x,y,fol1x,fol1y,fol2x,fol2y;
        x = aircraft.getX();
        y = aircraft.getY();
        fol1x = follower1.getX();
        fol1y = follower1.getY();
        fol2x = follower2.getX();
        fol2y = follower2.getY();
        if(fol1x!=x&&fol1y!=y&&fol2x!=x&&fol2y!=y) {
            if(fol1x<x){
                if(fol1x!=x){
                    follower1.move(5.,0);
                    fol1x = follower1.getX();
                    x = aircraft.getX();
                    y = aircraft.getY();
                    this.repaint();
                }
            }
            if(fol1y<y){
                if(fol1y!=y) {
                    follower1.move(0, 5.);
                    fol1y = follower1.getY();
                    x = aircraft.getX();
                    y = aircraft.getY();
                    this.repaint();
                }
            }
            if(fol1x>x){
                if(fol1x!=x){
                    follower1.move(-5.,0);
                    fol1x = follower1.getX();
                    x = aircraft.getX();
                    y = aircraft.getY();
                    this.repaint();
                }
            }
            if(fol1y>y){
                if(fol1y!=y) {
                    follower1.move(0, -5.);
                    fol1y = follower1.getY();
                    x = aircraft.getX();
                    y = aircraft.getY();
                    this.repaint();
                }
            }
            if(fol2x<x){
                if(fol2x!=x){
                    follower2.move(5.,0);
                    fol2x = follower2.getX();
                    x = aircraft.getX();
                    y = aircraft.getY();
                    this.repaint();
                }
            }
            if(fol2y<y){
                if(fol2y!=y) {
                    follower2.move(0, 5.);
                    fol2y = follower2.getY();
                    x = aircraft.getX();
                    y = aircraft.getY();
                    this.repaint();
                }
            }
            if(fol2x>x){
                if(fol2x!=x){
                    follower2.move(-5.,0);
                    fol2x = follower2.getX();
                    x = aircraft.getX();
                    y = aircraft.getY();
                    this.repaint();
                }
            }
            if(fol2y>y){
                if(fol2y!=y) {
                    follower2.move(0, -5.);
                    fol2y = follower2.getY();
                    x = aircraft.getX();
                    y = aircraft.getY();
                    this.repaint();
                }
            }
        }
    }
}
