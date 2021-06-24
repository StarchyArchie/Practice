package SERLessons.Alien;

import wheels.users.Frame;

import java.awt.*;

/**
 * Vishal Nigam
 * 2/15/18
 * Practice 2
 * Runs alien conversation.
 */
public class AlienApp extends Frame{
    public AlienApp(){
        Alien allen = new Alien(100,200, Color.gray,Color.green,"Howdy!");
        //Alien jerry = new Alien(350,200,Color.cyan,Color.MAGENTA,"How's it hangin' pal!");
    }
    public static void main(String[]args){
        AlienApp app = new AlienApp();
    }
}
