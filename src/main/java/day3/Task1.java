package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String r = "Россия";
        String i = "Италия";
        String e = "Англия";
        String g = "Германия";
        String u = "Неизвестная страна";
        while (true) {
            String city = s.nextLine();
            if (city.equals("Stop"))
                break;
            switch (city) {
                case "Москва" :
                case "Владивосток" :
                case "Ростов" :
                    System.out.println(r);
                    break;
                case "Рим" :
                case "Милан" :
                case "Турин" :
                    System.out.println(i);
                    break;
                case "Ливерпуль" :
                case "Манчестер" :
                case "Лондон" :
                    System.out.println(e);
                    break;
                case "Берлин" :
                case "Мюнхен" :
                case "Кёльн" :
                    System.out.println(g);
                    break;
                default:
                    System.out.println(u);
                    break;
            }
        }
    }
}
