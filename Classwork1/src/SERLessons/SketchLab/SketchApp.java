package SERLessons.SketchLab; /**
 * makes a small sketch board with buttons that create lines that draw in various directions
 * 
 * @author Vishal Nigam
 * @version 3/23/2018
 */
import wheels.users.*;
import wheels.users.Frame;
import wheels.users.Rectangle;

import java.awt.*;

public class SketchApp extends Frame {
	private SERLessons.SketchLab.Cursor _cursor;
	private DrawButton _upButton, _downButton;
	private DrawButton _leftButton, _rightButton, _upLeftButton, _upRightButton;
    private Rectangle blockade;
	private ConversationBubble _myBubble;
    private int lineMax = 50;

	public SketchApp() {
		_cursor = new SERLessons.SketchLab.Cursor();
		_myBubble = new ConversationBubble("Welcome to Sketch App :). Number of lines = "+_cursor.getLineCount());
		_myBubble.setLocation(0, 0);
		_upButton = new UpButton(350, 400, _cursor);
		_rightButton = new RightButton(370, 420, _cursor);
		_leftButton = new LeftButton(330, 420, _cursor);
		_downButton = new DownButton(350, 440, _cursor);
        _upLeftButton = new DiagUpLeftButton(330,400,_cursor);
        _upRightButton = new DiagUpRightButton(370,400,_cursor);
        while(_cursor.getLineCount()<lineMax){
            _myBubble.setText("Welcome to Sketch App :). Number of lines = "+_cursor.getLineCount());
        }
        _myBubble.setText( "You drew "+lineMax+" line segments. No more line segments allowed.");
        blockade = new Rectangle(330,400);
        blockade.setColor(Color.white);
        blockade.setSize(60,60);
	}

	public static void main(String[] argv) {
		new SketchApp();
	}
}
