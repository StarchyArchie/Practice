package SERLessons.Swingin.Buttons;
/**
 * Vishal Nigam
 * Displays whatever shapes are in the DrawingPanel
 */

import javax.swing.*;
import java.awt.*;

public class App extends javax.swing.JFrame
{
    private JPanel _buttonPanel, _radioButtonPanel;
    private ButtonGroup _colorButtonGroup;
    private DrawingPanel _drawPanel;

    public App(String title)
    {

        super(title);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        _drawPanel = new DrawingPanel();
        _buttonPanel = new JPanel();
        _radioButtonPanel = new JPanel();
        this.setLayout(new BorderLayout());

        // 1. Set the layout of the frame. Which layout would you choose and why?

        // 2. Create your sub panels, the _buttonPanel and the _radiButtonPanel
        // Remember that JPanel default layout is FlowLayout.
        ColorRadioButton rb1 = new ColorRadioButton("Red", true, Color.red, _drawPanel);
        ColorRadioButton rb2 = new ColorRadioButton("Blue", true, Color.blue, _drawPanel);
        ColorRadioButton rb3 = new ColorRadioButton("Green", true, Color.green, _drawPanel);
        _colorButtonGroup = new ButtonGroup();
        _colorButtonGroup.add(rb1);
        _colorButtonGroup.add(rb2);
        _colorButtonGroup.add(rb3);
        _radioButtonPanel.add(rb1);
        _radioButtonPanel.add(rb2);
        _radioButtonPanel.add(rb3);
        // 3. Create the _colorButtonGroup to which the radio buttons will be added

        // 4. Create the ColorRadiobuttons and add them to the _radioButtonPanel

        // 5. Add the radio buttons to the ButtonGroup, so that only one can be selected
        // at a time

        // 6. Create the regular Buttons and add them to the _buttonPanel
        ColorButton bt1 = new ColorButton("Circle",0,_drawPanel);
        ColorButton bt2 = new ColorButton("Square",1,_drawPanel);
        ColorButton bt3 = new ColorButton("Arc",2,_drawPanel);
        _buttonPanel.add(bt1);
        _buttonPanel.add(bt2);
        _buttonPanel.add(bt3);
        // 7. Add _drawPanel, _buttonPanel and _radioButtonPanel to the JFrame in
        // appropriate order.
        this.add(_drawPanel,BorderLayout.CENTER);
        JPanel gridPanel = new JPanel(new GridLayout(2,1));
        gridPanel.add(_radioButtonPanel,1,0);
        gridPanel.add(_buttonPanel,0,0);
        this.add(gridPanel,BorderLayout.SOUTH);


        this.pack();
        this.setVisible(true);
    }

    // 8. Write an action listener for the regular buttons. That listener can be a
    // private
    // class inside this class or a separate class outside of this class.

    public static void main(String[] args)
    {
        App app = new App("Shapes App");
    }
}
