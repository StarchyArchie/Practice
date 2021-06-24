package SERLessons.SketchLab;

/**
 * Vishal Nigam
 * 3/24/18
 */
public class DiagUpRightButton extends DrawButton{
    public DiagUpRightButton(int x, int y, Cursor cursor) {
        super(x, y, cursor);
    }

    public java.awt.Point computeNextPoint(java.awt.Point lastPoint) {
        return new java.awt.Point(lastPoint.x + 5, lastPoint.y - 5);
    }
}
