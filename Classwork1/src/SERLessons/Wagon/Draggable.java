package SERLessons.Wagon;
import java.awt.event.MouseEvent;
/**
 * Vishal Nigam
 * 2/20/18
 */
public interface Draggable {
    void move(int x, int y);
    void mousePressed(MouseEvent e);
    void mouseDragged(MouseEvent e);
}
