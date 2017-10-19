package Vertex.lesson3.homeWork;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task11TwoArray {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];

        countValue(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    /**
     * Write down values in order.
     */
    private static void countValue(int[][] arr) {
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = n;
                n++;
            }
        }
    }
}
