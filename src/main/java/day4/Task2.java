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
        int max_index = Integer.MIN_VALUE;
        int min_index = Integer.MAX_VALUE;
        int end0 = 0;
        int sumEnd0 = 0;
        for(int x:arr) {
            if (x > max_index) {
                max_index = x;
            }
            if (x < min_index) {
                min_index = x;
            }
            if (x % 10 == 0) {
                end0++;
            }
            if (x % 10 == 0) {
                sumEnd0 += x;
            }
        }
        System.out.println(max_index + " - наибольший элемент массива");
        System.out.println(min_index + " - наименьший элемент массива");
        System.out.println(end0 + " - количество элементов массива, оканчивающихся на 0");
        System.out.println(sumEnd0 + " - сумму элементов массива, оканчивающихся на 0");
    }
}
