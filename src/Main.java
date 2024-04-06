import geometry.ColoredCircle;
import geometry.Point;
import geometry.Circle;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2, 5);

        Circle circles[] = new Circle[4];

        Circle circleOne = new Circle(point, 7);
        Circle circleTwo = new Circle(point, 9);
        ColoredCircle coloredCircleOne = new ColoredCircle(point, 3, "red");
        ColoredCircle coloredCircleTwo = new ColoredCircle(point, 3, "grey");

        circles[0] = circleOne;
        circles[1] = circleTwo;
        circles[2] = coloredCircleOne;
        circles[3] = coloredCircleTwo;

        for(Circle circle : circles) {
            System.out.println(circle.getArea());
            if(circle instanceof ColoredCircle) {
                System.out.println(((ColoredCircle) circle).getColor());
            }
        }
    }
}