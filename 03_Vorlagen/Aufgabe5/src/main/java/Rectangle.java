import org.w3c.dom.css.Rect;

public class Rectangle {

    Point topLeft;
    Point bottomRight;

    Rectangle(Point topLeft, Point bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Rectangle(Point topLeft, int size) {
        this(topLeft, new Point(topLeft.getX() + size, topLeft.getY() + size));
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    boolean isSquare(){
        return getHeight() == getWidth();
    }

    private int getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    private int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    boolean isSame(Rectangle other){
        return topLeft.isSame(other.topLeft) && bottomRight.isSame(other.bottomRight);
    }

    boolean encloses(Rectangle other){

    }

    boolean overlaps(Rectangle other){

    }

    Rectangle stretch(int factor){

    }

    Rectangle shrink(int factor){

    }

}
