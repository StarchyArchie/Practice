package SERLessons.Swingin.Clock;

import javax.swing.*;

/**
 * Vishal Nigam
 * 3/29/18
 */
public class ColorApp {
    public ColorApp(){
        JFrame frame = new JFrame("Color App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ColorTextPanel panel = new ColorTextPanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[]args){
        new ColorApp();
    }
}
