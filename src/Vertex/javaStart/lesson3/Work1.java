package Vertex.javaStart.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Work1 {

    public static void main(String[] args) {
        Random random = new Random();
        int a = 0;
        int mas[] = new int[10];
        int masNew[] = new int[mas.length];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = 1 + random.nextInt(99);
        }
        System.out.println(Arrays.toString(mas));
        while (a < 5) {
            System.out.println(mas[random.nextInt(mas.length - 1)]);
            a++;
        }
        for (int i = 0; i < masNew.length; i++) {
            masNew[random.nextInt(masNew.length - 1)] = mas[random.nextInt(mas.length - 1)];
        }
        System.out.println(Arrays.toString(masNew));
    }
}
