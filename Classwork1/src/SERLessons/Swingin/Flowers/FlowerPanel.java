package SERLessons.Swingin.Flowers;
/**
 * Vishal Nigam
Panel to display the followers on.
**/
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class FlowerPanel extends JPanel implements MouseListener{

    private ArrayList<FlowerImage> flowers;
    private ImageIcon flowerImage,flowerAlt;
    private Point location;
    private int count;
    // constructor
    public FlowerPanel(){
        super();
        count = 0;
        flowers = new ArrayList<FlowerImage>();
        flowerImage = new ImageIcon("daffodil1.gif");
        flowerAlt = new ImageIcon("potoo.jpg");
        this.setBackground(java.awt.Color.green);
        addMouseListener(this);
    }

    public void paintComponent(java.awt.Graphics aBrush)
    {
        super.paintComponent(aBrush);
        for(int i=0; i<flowers.size(); i++){
            flowers.get(i).plant(aBrush);
        }

    }

    public void mouseClicked(MouseEvent e){
        location = e.getPoint();
        if(count%2==0){
        FlowerImage f = new FlowerImage(flowerImage.getImage(),location);
            flowers.add(f);
            count++;
        }
        else {
            FlowerImage f = new FlowerImage(flowerAlt.getImage(),location);
            flowers.add(f);
            count++;
        }
        this.repaint();
    }

    // leave these empty
    public void mousePressed(MouseEvent e){

    }

    public void mouseReleased(MouseEvent e){

    }

    public void mouseEntered(MouseEvent e){

    }

    public void mouseExited(MouseEvent e){

    }
}