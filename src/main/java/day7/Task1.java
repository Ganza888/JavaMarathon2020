package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("AIRBUS",2010,82,70);
        Airplane plane2 = new Airplane("BOEING",2012,80,72);
        Airplane.compareAirplanes(plane1,plane2);
    }
}