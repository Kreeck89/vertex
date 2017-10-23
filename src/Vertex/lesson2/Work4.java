package Vertex.lesson2;

import java.util.Random;

public class Work4 {

    public static void main(String[] args) {
        Random random = new Random();
        int a = 1;

        while (a <= 100) {
            int val = 1 + random.nextInt(99);
            if (val % 2 == 0) {
                System.out.println("even is " + val);
            } else {
                System.out.println("odd is " + val);
            }
            a++;
        }
    }
}
