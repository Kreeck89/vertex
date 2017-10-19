package Vertex.lesson3.homeWork;

import java.util.Random;

public class Task10TwoArray {
    public static void main(String[] args) {
        int twoArray[][] = new int[5][10];

        enterValue(twoArray);

        pritArray(twoArray);

        doubleValueArray(twoArray);

        System.out.println("Values in your array doubled.\nYour new Array is:");
        pritArray(twoArray);


    }

    /**
     * Enters random values in two-dimensional array.
     */
    private static void enterValue(int [][] twoArray) {
        Random random = new Random();
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                twoArray[i][j] = 10 + random.nextInt(20);
            }
        }
    }

    /**
     * Prints two-dimensional array.
     */
    private static void pritArray(int [][] twoArray) {
        System.out.println("Your two-dimensional array is:");
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                System.out.print(twoArray[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    /**
     * Doubles all values of two-dimensional array.
     */
    private static void doubleValueArray(int[][] twoArray) {
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                twoArray[i][j] *= 2;
            }
        }
    }

}
