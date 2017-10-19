package Vertex.lesson3.homeWork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];

        addRandom(arr);

        System.out.println("Your random values array:");
        outAll(arr);

        System.out.println("Enter ranges for trim array:");
        System.out.println("From 0 to " + (arr.length - 1));
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < 0 & a > arr.length - 1 | b < 0 & b > arr.length - 1) {
            System.out.println("Your value is wrong!");
        } else {
            outPart(arr, a, b);
        }

        System.out.print("Your array length is:  ");
        int l = length(arr);
        System.out.println(l);
    }


    /**
     * Enters random values in your array.
     */
    private static int [] addRandom(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + random.nextInt(99);
        }
        return arr;
    }

    /**
     * Print array values.
     */
    private static void outAll(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Print your array in range from a to b.
     */
    private static void outPart(int[] arr, int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(arr[i]);
            }
        } else if (a > b) {
            for (int i = a; i >= b; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    /**
     * Return array`s length value.
     */
    private static int length(int[] arr) {
        int l = arr.length;
        return l;
    }
}
