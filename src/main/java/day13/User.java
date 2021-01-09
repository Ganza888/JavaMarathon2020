package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public String getUsername() {
        return username;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User subUser: subscriptions) {
            if (subUser.getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user) {
        return user.isSubscribed(user) && isSubscribed(user);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);

    }

    public String toString() {
        return  username;
    }
}
