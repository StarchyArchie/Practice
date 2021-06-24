package SERLessons.WormApp; /**
 * Builds an object called Worm out of ellipses of 2 alternating colors.
 * 
 * Vishal Nigam
 */

import java.awt.Color;

public class Worm{
    private java.awt.Color _mainColor;
    private java.awt.Color _alternateColor;
    private Head _head;
    private Body bod;

    public Worm() {
        this (Color.green, Color.blue);
    }
    public Worm(Color mai, Color alt){
        _mainColor = mai;
        _alternateColor = alt;
        _head = new Head(mai,alt);
        _head.setLocation(200,160);
        bod = new Body(mai,alt);
        bod.setLocation(270,200);
    }
}

