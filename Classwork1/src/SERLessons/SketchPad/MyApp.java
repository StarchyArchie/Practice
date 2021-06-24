package SERLessons.SketchPad;

import wheels.users.Frame;

/**
 * Vishal Nigam
 * 3/1/18
 */
public class MyApp extends Frame{
    DrawButton up,down,left,right;
    Cursor cursor;
    public MyApp(){
        cursor = new Cursor();
        up = new UpButton(350,400,cursor);
    }
    public static void main(String[]args){
        MyApp app = new MyApp();
    }
}
