package Vertex.javaStart.lesson5;

import java.util.Arrays;
import java.util.Random;

/**
 * Takes random array, random values for all and save them.
 */
public class RandomArraysCopy {

    public static void main(String[] args) {
        Random random = new Random();
        int masReal[] = new int[10];
        int arr1[] = new int[masReal.length];
        int arr2[] = new int[masReal.length];
        int whatArr = 1 + random.nextInt(1);

        for (int i = 0; i < masReal.length; i++) {
            masReal[i] = 1 + random.nextInt(99);
        }

        switch (whatArr) {
            case 1:
                for (int aMasReal : masReal) {
                    int ranReal = random.nextInt(masReal.length - 1);
                    int ranArr = random.nextInt(masReal.length - 1);
                    arr1[ranArr] = masReal[ranReal];
                }
                break;
            case 2:
                for (int aMasReal : masReal) {
                    int ranReal = random.nextInt(masReal.length - 1);
                    int ranArr = random.nextInt(masReal.length - 1);
                    arr2[ranArr] = masReal[ranReal];
                }
                break;
        }
        System.out.println(Arrays.toString(masReal));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
