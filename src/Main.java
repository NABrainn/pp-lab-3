import geometry.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(6);
        System.out.println("Area: " + square.calculateArea() + " Perimeter: " + square.calculatePerimeter());
    }
}