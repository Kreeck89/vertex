package Vertex.lesson1;

import java.util.Random;

public class Work10 {

    public static void main(String[] args) {
        String name1 = "Alex";
        String name2 = "Bob";
        String name3 = "Sveta";
        String name4 = "me";

        Random random = new Random();
        int num = 1 + random.nextInt(3);
        System.out.println("Before: " + num);

        if (num == 4) {
            num = 1 + random.nextInt(3);
        }
    }
}
