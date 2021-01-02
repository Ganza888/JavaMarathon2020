package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 90;
        int max = 100;
        int diff = max - min;
        Player player1 = new Player(random.nextInt(diff) + min);
        Player player2 = new Player(random.nextInt(diff) + min);
        Player player3 = new Player(random.nextInt(diff) + min);
        Player player4 = new Player(random.nextInt(diff) + min);
        Player player5 = new Player(random.nextInt(diff) + min);
        Player player6 = new Player(1);
        player6.run();
        Player.info();
    }
}
