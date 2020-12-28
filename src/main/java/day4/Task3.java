package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int[][] arr = new int[m][n];
        int min = 0;
        int max = 50;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 0);
        i += min;
        int maxSum = 0;
        int number = 0;
        for(int j =0; j < arr.length; j++) {
            int sumString = 0;
            for(int l = 0; l < arr[j].length; l++) {
                arr[j][l] = random.nextInt(diff + 0);
                sumString += arr[j][l];
                System.out.print(arr[j][l] + " ");
            }
            System.out.print("/ " + sumString);
            System.out.println();
            if (sumString > maxSum) {
                maxSum = sumString;
                number = j;
            }
        }
        System.out.println();
        System.out.println(number);
    }
}
