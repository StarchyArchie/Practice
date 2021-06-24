package SERLessons.Swingin.Sliders;/*
 *  In class demo
 */

import java.awt.*;
import java.awt.geom.*; 
public class DrawingPanel extends javax.swing.JPanel {
    
    
    private ColorShape _shape;
    private int _typeOfShape = 0;
    private Color _shapeColor ;
    
    public DrawingPanel(ColorShape shape) {
       super();    
       this.setBackground(java.awt.Color.white);
       this.setPreferredSize(new java.awt.Dimension(500, 500));
       this.setSize(new java.awt.Dimension(500, 500));

        _shapeColor = Color.red;
       //default shape is Ellipse
       _shape = shape;
         
    }

    public void paintComponent(Graphics g) {
       super.paintComponent(g);
       Graphics2D brush = (Graphics2D) g;
          
         _shape.draw(brush);
       _shape.fill(brush);
    }
    
    public void move(int x, int y){
    	if (x == 0)
    		x = (int)_shape.getX();
    	else
    		y=(int)_shape.getY();
    	
    	
    	_shape.setLocation(x, y);
    	repaint();
    }
    
    public void setShapeColor(Color c){
        _shape.setFillColor(c);
        repaint();
    }
  
}
