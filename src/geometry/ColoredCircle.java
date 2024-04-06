package geometry;

public class ColoredCircle extends Circle{

    private String color;

    public ColoredCircle(Point point, double radius, String color) {
        super(point, radius);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
