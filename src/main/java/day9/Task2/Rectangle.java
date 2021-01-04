package day9.Task2;

public class Rectangle extends Figure {
    private double width;
    private double height;
    private double area;
    private double perimeter;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        area = (width * height);
        return area;
    }

    @Override
    public double perimeter() {
        perimeter = (2 * (width + height));
        return perimeter;
    }
}
