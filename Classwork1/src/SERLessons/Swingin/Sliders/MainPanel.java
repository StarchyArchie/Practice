package SERLessons.Swingin.Sliders;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainPanel extends JPanel {
	private ColorShape _shape;
	
	public MainPanel() {
		super(new BorderLayout());
		// set the layout to boarderlayout
        //this.setLayout(new BorderLayout)
		_shape = new ColorEllipse(Color.black,Color.black);
		
		DrawingPanel dp = new DrawingPanel(_shape);
		dp.setPreferredSize(new Dimension(300, 300));

		// initialize sub-panels
        // other initialization elided including _shape
        JPanel radioRow = new JPanel();
        JPanel labelRow = new JPanel();

		// default FlowLayouts for rows


		// create and add labels (y label elided)
        JLabel xLabel = new JLabel("X=100");
        JLabel yLabel = new JLabel("Y = 100");
		labelRow.add(xLabel);
        labelRow.add(yLabel);
        ButtonGroup bg = new ButtonGroup();
        ColorRadioButton red = new ColorRadioButton("Red", true, Color.red, dp,bg);
        ColorRadioButton white = new ColorRadioButton("White", true, Color.red, dp,bg);
        ColorRadioButton blue = new ColorRadioButton("Blue", true, Color.red, dp,bg);
        ColorRadioButton green = new ColorRadioButton("Green", true, Color.red, dp,bg);
        radioRow.add(red);
        radioRow.add(white);
        radioRow.add(blue);
        radioRow.add(green);
       // MoverSlider slider = new MoverSlider(0,300,dp,0,SwingConstants.HORIZONTAL);
        this.add(dp,BorderLayout.CENTER);
        //this.add(south,BorderLayout.SOUTH);
	}
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		
	}

}
