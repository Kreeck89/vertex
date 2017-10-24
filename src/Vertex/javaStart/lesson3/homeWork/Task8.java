package Vertex.javaStart.lesson3.homeWork;

import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        int massLong[] = new int[20];
        for (int i = 0; i < massLong.length; i++) {
            massLong[i] = 1 + random.nextInt(99);
        }
        System.out.println("Your first array:");
        System.out.println(Arrays.toString(massLong));

        int massNew []= multyplyTwo(massLong);
        System.out.println("New array with multiple 2 values:");
        System.out.println(Arrays.toString(massNew));
    }

    /**
     * Count how many values multiple 2.
     * And create new Array with it values.
     */
    private static int [] multyplyTwo(int [] massLong) {
        int count = 0;
        for (int i = 0; i < massLong.length; i++) {
            if (massLong[i]%2 == 0) {
                count++;
            }
        }
        int massNew[] = new int[count];

        for (int i = 0; i < massNew.length; ) {
            for (int j = 0; j < massLong.length; j++) {
                if (massLong[j] % 2 == 0) {
                    massNew[i] = massLong[j];
                    i++;
                }
            }
        }
        return massNew;
    }
}
