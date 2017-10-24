package Vertex.javaStart.lesson3.homeWork;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two values for multiplication:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int mult = getMultyPly(x, y);

        System.out.println(mult);

        scanner.close();
    }

    /**
     *  Makes multiplication two values.
     */
    private static int getMultyPly(int a, int b) {
        int multy = a * b;
        return multy;
    }
}
