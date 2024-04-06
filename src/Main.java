import geometry.Point;
import geometry.Circle;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        Circle circle = new Circle(point, 4);
        System.out.println("Center: " + circle.getCenter() + " Radius: " + circle.getRadius());
    }
}