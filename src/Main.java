import geometry.ColoredCircle;
import geometry.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(6.4, 8);
        ColoredCircle coloredCircle = new ColoredCircle(point, 10, "blue");
        System.out.println("Center: " + coloredCircle.getCenter().getX() + ", " + coloredCircle.getCenter().getY() + " Radius: " + coloredCircle.getRadius() + " Color: " + coloredCircle.getColor());
    }
}