package day2;

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double y = 0;
        if (x >= 5) {
            y = ((pow(x, 2) - 10 ) / (x + 7));
        } else if (-3 < x && x < 5) {
            y = ((x + 3) * (pow(x, 2) - 2));
        } else if (x <= -3) {
            y = 420;
        }
        System.out.println(y);
    }
}
