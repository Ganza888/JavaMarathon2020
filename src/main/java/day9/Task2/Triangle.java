package day9.Task2;

public class Triangle extends Figure {
    private double aLength;
    private double bLength;
    private double cLength;
    private double area;
    private double perimeter;

    public Triangle(int aLength, int bLength, int cLength, String color) {
        super(color);
        this.aLength = aLength;
        this.bLength = bLength;
        this.cLength = cLength;
    }

    @Override
    public double area() {
        area = Math.sqrt(perimeter/2 * (perimeter/2 - aLength) * (perimeter/2 - bLength) * (perimeter/2 - cLength));
        return area;
    }

    @Override
    public double perimeter() {
        perimeter = (aLength + bLength + cLength);
        return perimeter;
    }
}
