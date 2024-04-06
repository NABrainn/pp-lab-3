import geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("Area: " + rectangle.calculateArea() + " Perimeter: " + rectangle.calculatePerimeter());
    }
}