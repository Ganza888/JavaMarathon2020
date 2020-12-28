package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();
        int min = 0;
        int max = 10000;
        int diff = max - min;
        int i = random.nextInt(diff + 0);
        i += min;
        for(int j =0; j < arr.length; j++) {
            arr[j] = random.nextInt(diff + 0);
        }

        int max_index = 0;
        for(int a:arr) {
            if (a > max_index) {
                max_index = a;
            }
        }
        System.out.println(max_index + " - наибольший элемент массива");

        int min_index = 0;
        for(int b:arr) {
            if (b < min_index) {
                min_index = b;
            }
        }
        System.out.println(min_index + " - наименьший элемент массива");

        int c = 0;
        for(int d:arr) {
            if (d % 10 == 0) {
                c++;
            }
        }
        System.out.println(c + " - количество элементов массива, оканчивающихся на 0");

        int f = 0;
        for(int g:arr) {
            if (g % 10 == 0) {
                f += g;
            }
        }
        System.out.println(f + " - сумму элементов массива, оканчивающихся на 0");
    }
}
