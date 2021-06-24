package SERLessons.Swingin.AnimAlien;

import javax.swing.*;

/**
 * Vishal Nigam
 * 3/22/18
 */
public class DrawApp extends JFrame{
    public static void main(String[]args){
        new DrawApp();
    }
    public DrawApp(){
        this.setSize(500,450);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new DrawingPanel());
        this.setVisible(true);
    }
}
