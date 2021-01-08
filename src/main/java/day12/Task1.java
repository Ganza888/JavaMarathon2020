package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Seat");
        cars.add("Tesla");
        cars.add("Fiat");
        cars.add(2,"Lotus");
        cars.remove(0);
        System.out.println(cars);
    }
}
