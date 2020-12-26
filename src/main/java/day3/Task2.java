package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            double a = s.nextDouble();
            double b = s.nextDouble();
            double div = a / b;
            if (b > 0) {
                System.out.println(div);
            }
            if ( b == 0)
                break;
        }
    }
}
