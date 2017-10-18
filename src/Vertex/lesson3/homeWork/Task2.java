package Vertex.lesson3.homeWork;

import java.util.Scanner;

public class Task2 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two values, please.");

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(getMax(a, b));
        scanner.close();
    }

    /**
     * The method returns larger value.
     */
    private static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
