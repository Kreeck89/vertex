package Vertex.lesson3.homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size for create new array:");
        int n = scanner.nextInt();

        int newArray[] = createArray(n);

        System.out.println("Your new array is:" + "\n" + Arrays.toString(newArray));
        scanner.close();
    }

    /**
     * Write in array values from 10 with step +2.
     */
    private static int[] createArray(int n) {
        int nArray[] = new int[n];
        int x = 10;
        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = x;
            x += 2;
        }
        return nArray;
    }
}
