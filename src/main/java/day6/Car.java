package day6;

public class Car {
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

    // Task1 day6

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        int yearDifference = year - inputYear;
        if (inputYear <= year) {
            System.out.println("Разница " + yearDifference + " лет");
        } else {
            System.out.println("Разница " + (-yearDifference) + " лет");
        }
        return yearDifference;
    }
}
