package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("n1");
        User user2 = new User("n2");
        User user3 = new User("n3");

        user1.sendMessage(user2, "Hola");
        user1.sendMessage(user2, "Que tal");

        user2.sendMessage(user1, "Hi");
        user2.sendMessage(user1, "Whats up");
        user2.sendMessage(user1, "Bye");

        user3.sendMessage(user1, "asd");
        user3.sendMessage(user1, "dsa");
        user3.sendMessage(user1, "zxc");

        user1.sendMessage(user3, "qwe");
        user1.sendMessage(user3, "ert");
        user1.sendMessage(user3, "dfg");

        user3.sendMessage(user1, "cvb");

        MessageDatabase.showDialog(user1, user3);
    }
}
