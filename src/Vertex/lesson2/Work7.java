package Vertex.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Work7 {

    public static void main(String[] args) {
        Random random = new Random();
        int a = 0;
        int b = 0;
        int mass[] = new int[10];

        while (a < mass.length) {
            mass[a] = 1 + random.nextInt(999);
            a++;
        }
        while (b < mass.length) {
            System.out.println(mass[b]);
            b++;
        }
    }
}
