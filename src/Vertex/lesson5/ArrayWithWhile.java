package Vertex.lesson5;

import java.util.Arrays;
import java.util.Random;

public class ArrayWithWhile {

    public static void main(String[] args) {
        Random random = new Random();
        int n = 0;
        int mass[] = new int[10];
        while (n < mass.length) {
            mass[n] = 1 + random.nextInt(99);
            n++;
        }
        System.out.println(Arrays.toString(mass));
    }
}
