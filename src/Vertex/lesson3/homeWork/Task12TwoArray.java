package Vertex.lesson3.homeWork;

import java.util.Arrays;

public class Task12TwoArray {
    public static void main(String[] args) {
        int mas[][] = new int[5][5];

        masSort(mas);

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    /**
     * Sort two-dimension array from 0 to end of array.
     * Sorts array by snake.
     */
    private static void masSort(int[][] mas) {
        int n = 0;
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mas[i].length; j++) {
                    mas[i][j] = n;
                    n++;
                }
            } else {
                for (int k = mas[i].length - 1; k>=0; k--) {
                    mas[i][k] = n;
                    n++;
                }
            }
        }
    }
}
