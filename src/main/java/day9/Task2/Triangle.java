package day9.Task2;

public class Triangle extends Figure {
    private double aLength;
    private double bLength;
    private double cLength;

    public Triangle(int aLength, int bLength, int cLength, String color) {
        super(color);
        this.aLength = aLength;
        this.bLength = bLength;
        this.cLength = cLength;
    }

    @Override
    public double area() {
        double p = ((aLength + bLength + cLength) / 2);
        return Math.sqrt(p * (p - aLength) * (p - bLength) * (p - cLength));
    }

    @Override
    public double perimeter() {
        return (aLength + bLength + cLength);
    }
}
