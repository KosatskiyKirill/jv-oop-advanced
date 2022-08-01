package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width, double area, String color) {
        super(color, area);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("rectangle, " + "area: " + calculateArea() + " sq.units,"
                + " length: " + length + " units," + " width: "
                + width + " units," + " color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
