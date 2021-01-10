package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("src\\main\\resources\\shoes.csv");
        Scanner scanner = new Scanner(file1);

        File file2 = new File("src\\main\\resources\\missing_shoes.txt");
        PrintWriter pw = new PrintWriter(file2);

        while (scanner.hasNextLine()) {
            String[] shoes = scanner.nextLine().split(";");
            if (Integer.parseInt(shoes[2]) == 0) {
                pw.println(shoes[0] + ", " + shoes[1] + ", " + shoes[2]);
            }
        }
        pw.close();
        scanner.close();
    }
}
