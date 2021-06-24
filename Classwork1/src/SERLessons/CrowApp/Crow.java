package SERLessons.CrowApp;

import java.awt.*;

/**
 * Vishal Nigam
 * 1/30/18
 */
public class Crow {
    //instance variables
    private char _gender;
    private Wing _wing;
    //constructors
    public Crow(){
        _gender = 'm';
        _wing = new Wing();
    }
    //methods
    public void fly(){
        System.out.print("calling fly");
        _wing.flap();
    }
    public void setColors(Color bodyColor, Color headColor, int age){
        System.out.println(bodyColor.toString()+" "+headColor.toString()+" "+age);

    }
}
