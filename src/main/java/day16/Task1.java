package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("t1.txt");
        printResult(file);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        double sum = 0;
        double average = 0;
        for (String x : numbers) {
            sum += Integer.parseInt(x);
            average = sum / numbers.length;
        }
        System.out.printf(average + " --> %.3f", average);
        scanner.close();
    }
}

