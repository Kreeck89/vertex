package Vertex.javaStart.lesson5.TaskForMe;

import java.util.Arrays;

public class Main extends User{

    public static void main(String[] args) {
        User userMass[] = new User[5];
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();
        User user5 = new User();

        user1.setName("Valera");
        user1.setAge(25);
        user1.setSurName("Brovkin");
        user1.setSex("Man");
        userMass[0] = user1;

        user2.setName("Alex");
        user2.setAge(22);
        user2.setSurName("Brokin");
        user2.setSex("Man");
        userMass[1] = user2;

        user3.setName("Vera");
        user3.setAge(35);
        user3.setSurName("Brans");
        user3.setSex("Woman");
        userMass[2] = user3;

        user4.setName("Sveta");
        user4.setAge(24);
        user4.setSurName("Kolnin");
        user4.setSex("Woman");
        userMass[3] = user4;

        user5.setName("Sergey");
        user5.setAge(20);
        user5.setSurName("Kashov");
        user5.setSex("Man");
        userMass[4] = user5;

        System.out.println(Arrays.toString(userMass));
        System.out.println(foundAlex(userMass));
    }

    /**
     * Founds some user with specified name.
     */
    private static boolean foundAlex(User[] userMass) {
        for (User userMas : userMass) {
            if (userMas.getName().equals("Alex")) {
                return true;
            }
        }
        return false;
    }
}
