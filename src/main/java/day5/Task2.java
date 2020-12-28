package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(2017,"Черный","R9T");
        System.out.println("Год выпуска " + bike.getYear());
        System.out.println("Цвет " + bike.getColor());
        System.out.println("Модель " + bike.getModel());
    }
}
class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }

}
