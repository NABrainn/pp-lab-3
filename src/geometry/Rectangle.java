package geometry;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return this.width * this.length;
    }

    public double calculatePerimeter() {
        return 2 * this.length + 2 * this.width;
    }
}
