package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1967);
        car.setColor("Синий");
        car.setModel("Mustang");
        System.out.println("Год выпуска " + car.getYear());
        System.out.println("Цвет " + car.getColor());
        System.out.println("Модель " + car.getModel());
    }
}
class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        if (year < 1950) {
            System.out.println("Неправильный год");
        } else
            this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("Пустое значение");
        } else
            this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setModel(String model) {
        if (model.isEmpty()) {
            System.out.println("Пустое значение");
        } else
            this.model = model;
    }
    public String getModel() {
        return model;
    }
}
