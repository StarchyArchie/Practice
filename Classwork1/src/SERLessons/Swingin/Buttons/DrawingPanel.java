package SERLessons.Swingin.Buttons;

import java.awt.*;
import java.awt.geom.*;

public class DrawingPanel extends javax.swing.JPanel
{
    private ColorShape _shape;
    private int _typeOfShape = 0;
    private Color _shapeColor;

    public DrawingPanel()
    {
        super();
        this.setBackground(java.awt.Color.white);
        this.setPreferredSize(new java.awt.Dimension(500, 500));
        this.setSize(new java.awt.Dimension(500, 500));

        _shapeColor = Color.red;
        // default shape is Ellipse
        _shape = new ColorEllipse(_shapeColor, _shapeColor);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D brush = (Graphics2D) g;
        if (_typeOfShape == 0)
            _shape = new ColorEllipse(_shapeColor, _shapeColor);
        else if (_typeOfShape == 1)
            _shape = new ColorRectangle(_shapeColor, _shapeColor);
        else
            _shape = new ColorArc(100, 100, 150, 130, 255, 90, Arc2D.Double.CHORD, _shapeColor);

        _shape.draw(brush);
        _shape.fill(brush);
    }

    public void setTypeOfShape(int type)
    {
        _typeOfShape = type;
    }

    public void setShapeColor(Color c)
    {
        _shapeColor = c;
    }
}
