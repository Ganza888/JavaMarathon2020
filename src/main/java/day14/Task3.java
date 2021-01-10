package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }

    public static List<Person> parseFileToObjList() {
        File file1 = new File("People.txt");
        List<Person> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] people = line.split(" ");
                if (Integer.parseInt(people[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                Person person1 = new Person(people[0],Integer.parseInt(people[1]));
                list.add(person1);
            }
            return list;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
