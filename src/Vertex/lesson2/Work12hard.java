package Vertex.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Work12hard {
    public static void main(String[] args) {
        Random random = new Random();
        int massOur[] = {12, 48, 3, 22, 8};
        int mass0[] = new int[5];
        int mass1[] = new int[5];

        int i = random.nextInt(4);
        int j = random.nextInt(4);
        int k = 1 +  random.nextInt(9);

        if (k == 1) {
            mass0[j] = massOur[i];
            System.out.println("It`s random value mass0 = " + mass0[j]);
        } else {
            mass1[j] = massOur[i];
            System.out.println("It` random value mass1 = " + mass1[j]);
        }

        System.out.println(Arrays.toString(massOur));
        System.out.println(Arrays.toString(mass0));
        System.out.println(Arrays.toString(mass1));

    }
}
