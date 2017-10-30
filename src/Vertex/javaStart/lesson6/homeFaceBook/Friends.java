package Vertex.javaStart.lesson6.homeFaceBook;

import java.util.ArrayList;

public class Friends extends News {

    ArrayList<User> arrayFriends = new ArrayList<>();

    /**
     * Add some friends to your list.
     */
    public void friendsList(User user) {
        arrayFriends.add(user);
    }

    /**
     * Show all your friends.
     */
    public void wievDataFriends() {
        for (int i = 0; i < arrayFriends.size(); i++) {
            System.out.println(arrayFriends.get(i).toString());
        }
    }
}
