package SERLessons.Swingin.Smartshapes;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    private DrawingPanel dp;
    private ButtonGroup bg;
    private JPanel buttonPanel;
	public App() {
		super();
        this.setSize(1000, 1000);
        dp = new DrawingPanel();
        buttonPanel = new JPanel();
        this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        bg = new ButtonGroup();
        MoveButton r = new MoveButton("Random", true, dp,0);
        MoveButton f = new MoveButton("Follow", true, dp,1);
        MoveButton s = new MoveButton("Stop", true, dp,2);
        bg.add(r);
        bg.add(s);
        bg.add(f);
        buttonPanel.add(r);
        buttonPanel.add(f);
        buttonPanel.add(s);
        this.add(dp, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new App();
	}
}
