package day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void info() {
        System.out.print("Изготовитель: " + producer + ", ");
        System.out.print("год выпуска: " + year + ", ");
        System.out.print("длина: " + length + ", ");
        System.out.print("вес: " + weight + ", ");
        System.out.println("количество топлива в баке: " + fuel);
    }

    public void fillUp(int n) {
        fuel += n;
    }
}
