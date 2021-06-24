package SERLessons.Wagon; /**
 * Vishal Nigam
 * 2/20/18
 */
import java.awt.Color;
import java.awt.event.MouseEvent;

public class Wagon implements Draggable{
    //instant vars
    private DraggableRectangle _body, _handle;
    private DraggableEllipse _frontWheel, _rearWheel;
    private int _x, _y, mousex, mousey;
    Wagon componentOf;
    //constructor
    public Wagon(Color color) {
        this(Color.yellow, 200, 200);
    }

    public Wagon(Color color, int x, int y) {
        // create the vars
        //called the parameterized constructor of rectangle that sets the color of the rectangle.
        _body = new DraggableRectangle(color);
        _handle = new DraggableRectangle(Color.black);
        _frontWheel = new DraggableEllipse(Color.black,this);
        _rearWheel = new DraggableEllipse(Color.black,this);


        //set sizes
        _body.setSize(200, 75);
        _handle.setSize(150, 20);

        //set locations
        this.setLocation(x, y);

    }

    //default constructor call my parameterized constructor and pass a default color
    public Wagon() {
        this(Color.yellow);
    }


    //methods

    public int get_x() {
        return _x;
    }
    public void set_x(int _x) {
        this._x = _x;
    }


    public void mouseDragged(MouseEvent e) {

        componentOf.mouseDragged(e);
        //x = e.getX();
        //y = e.getY();
        //setLocation(mousex-x,mousey-y);
        move((e.getX() - mousex),(e.getY()-mousey));
    }


    public void mousePressed(MouseEvent e) {
        componentOf.mousePressed(e);
        mousex = e.getX();
        mousey = e.getY();
    }

    public int get_y() {
        return _y;
    }


    public void set_y(int _y) {
        this._y = _y;
    }


    public void setLocation(int x, int y)
    {
        _x =x;
        _y= y;
        _body.setLocation(_x,_y);
        _frontWheel.setLocation(_x+25,_y+50);
        _rearWheel.setLocation(x+125,y+50);
        _handle.setLocation(_x-150, _y+30);
    }

    @Override
    public void move(int x, int y) {

    }
}