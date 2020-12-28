package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();
        int min = 0;
        int max = 10000;
        int diff = max - min;
        int i = random.nextInt(diff + 0);
        i += min;
        int maxSum = 0;
        int number = 0;
        for(int j = 0; j < arr.length; j++) {
            arr[j] = random.nextInt(diff + 0);
        }
        for(int j = 0; j < arr.length - 2; j++) {
            int sum = 0;
            for(int k = j; k < j + 3; k++) {
                sum += arr[k];
            }
            if (sum > maxSum) {
                maxSum = sum;
                number = j;
            }
        }
        System.out.println(number);
    }
}
