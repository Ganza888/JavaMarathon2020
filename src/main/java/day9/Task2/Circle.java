package day9.Task2;

public class Circle extends Figure{
    private double radius;
    private double area;
    private double perimeter;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        area = (Math.PI * Math.pow(radius, 2));
        return area;
    }

    @Override
    public double perimeter() {
        perimeter = (2 * Math.PI * radius);
        return perimeter;
    }
}
