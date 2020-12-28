package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        Random random = new Random();
        int min = 0;
        int max = 10;
        int diff = max - min;
        int j = random.nextInt(diff + 0);
        j += min;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(diff + 0);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + n);

        int a = 0;
        int b = 0;
        for(int c:arr) {
            if (c > 8) {
                a += c;
                b = a / c;
            }
        }
        System.out.println("Количестве чисел больше 8: " + b);

        int d = 0;
        int e = 0;
        for(int f:arr) {
            if (f == 1) {
                d += f;
                e = d / f;
            }
        }
        System.out.println("Количестве чисел равных 1: " + e);

        int h = 0;
        for(int k:arr) {
            if (k % 2 == 0) {
                h++;
            }
        }
        System.out.println("Количестве четных чисел: " + h);

        int l =0;
        for(int m:arr) {
            if (m % 2 != 0) {
                l++;
            }
        }
        System.out.println("Количестве нечетных чисел: " + l);

        int sum = 0;
        for (int x:arr) {
            sum += x;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
