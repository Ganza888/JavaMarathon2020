package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Airbus", 2010, 38, 78);
        plane1.setFuel(0);
        plane1.info();
        plane1.fillUp(20);
        Airplane plane2 = new Airplane("Boeing",2008,37,77);
        plane2.setYear(2011);
        plane2.setLength(36);
        plane2.fillUp(10);
        plane2.fillUp(8);
        plane2.info();
    }
}
