package SERLessons.SketchLab;

/**
 * Vishal Nigam
 * 3/24/18
 */
public class DiagUpLeftButton extends DrawButton{
    public DiagUpLeftButton(int x, int y, Cursor cursor) {
        super(x, y, cursor);
    }

    public java.awt.Point computeNextPoint(java.awt.Point lastPoint) {
        return new java.awt.Point(lastPoint.x - 5, lastPoint.y - 5);
    }
}
