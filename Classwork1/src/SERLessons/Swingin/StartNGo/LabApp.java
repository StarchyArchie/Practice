package SERLessons.Swingin.StartNGo;

import javax.swing.*;

/**
 * Vishal Nigam
 * 4/6/18
 */
public class LabApp {
    public LabApp(){
        JFrame frame = new JFrame("Lab 10");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ButtonPanel panel = new ButtonPanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[]args){
        new LabApp();
    }
}
