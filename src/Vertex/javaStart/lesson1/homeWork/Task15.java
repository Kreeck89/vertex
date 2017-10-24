package Vertex.javaStart.lesson1.homeWork;

import java.util.Scanner;

public class Task15 {

    /**
     * Print highest value from array.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];

        for (int j = 0; j<arr.length; j++) {
            arr[j] = scanner.nextInt();
        }
        int big = arr[0];
        for (int k = 1; k<arr.length; k++) {
            if (big < arr[k]) {
                big = arr[k];
            }
        }
        System.out.println(big);
        scanner.close();
    }
}
