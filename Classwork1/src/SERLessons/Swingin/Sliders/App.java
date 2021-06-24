package SERLessons.Swingin.Sliders; /**
 * Displays what ever shapes are in the DrawingPanel
 */


import javax.swing.*;

public class App extends javax.swing.JFrame {

    private JPanel _buttonPanel,_radioButtonPanel;
    private ButtonGroup _colorButtonGroup;
    
    DrawingPanel _drawPanel;
  
   public App (String title) {

    super(title);
    this.setSize(500, 500);
    this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    this.add(new MainPanel());
    
    this.pack();
    this.setVisible(true);
  }

  public static void main (String [ ] args) {
    App app = new App ("Shapes App");
  }
}
