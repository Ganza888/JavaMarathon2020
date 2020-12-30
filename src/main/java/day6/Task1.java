package day6;


public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        car.setYear(2000);
        car.yearDifference(2020);
        System.out.println();
        Motorbike bike = new Motorbike(2016,"Серый","F1Z");
        bike.info();
        bike.yearDifference(2010);
    }
}
