package SERLessons.SketchLab;

import wheels.users.*;

public abstract class DrawButton extends Ellipse {
	private Cursor _cursor;

	public DrawButton(int x, int y, Cursor cursor) {
		super(x, y);
		this.setSize(18, 18);
		_cursor = cursor; // store reference to peer cursor
	}

	public void mousePressed(java.awt.event.MouseEvent e) {
		this.setFillColor(java.awt.Color.blue);
	}

	public void mouseReleased(java.awt.event.MouseEvent e) {
		java.awt.Point lastPoint = _cursor.getLocation();
		java.awt.Point nextPoint = computeNextPoint(lastPoint);
		Line line = new Line(lastPoint, nextPoint);
		line.setColor(java.awt.Color.black);
		line.setThickness(2);
		_cursor.setLocation(nextPoint);
        _cursor.addLine();
		this.setFillColor(java.awt.Color.red);
	}

	public abstract java.awt.Point computeNextPoint(java.awt.Point lastPoint);
}
