package SERLessons.InterfaceLesson;

import java.awt.*;

/**
 * Vishal Nigam
 * 2/15/18
 */
public class Puppy implements Mover,Colorable{
    @Override
    public void move(){
    System.out.println("Puppy move");}

    @Override
    public void serColor(Color c) {

    }

    @Override
    public void getColor() {

    }
}
