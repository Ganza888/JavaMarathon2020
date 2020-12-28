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
        int over8 = 0;
        int one = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;
        for(int x:arr) {
            if (x > 8) {
                over8++;
            }
            if (x == 1) {
                one++;
            }
            if (x % 2 == 0) {
                even++;
            }
            if (x % 2 != 0) {
                odd++;
            }
            sum += x;
        }
        System.out.println("Количестве чисел больше 8: " + over8);
        System.out.println("Количестве чисел равных 1: " + one);
        System.out.println("Количестве четных чисел: " + even);
        System.out.println("Количестве нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
