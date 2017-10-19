package Vertex.lesson3.homeWork;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int mass[] = new int[20];

        sortMass(mass);

        System.out.println(Arrays.toString(mass));
    }

    /**
     * Sorts array [0 - n%2=0]
     */
    private static void sortMass(int [] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 0) {
                mass[i] = i;
            } else {
                mass[i] = 0;
            }
        }
    }
}
