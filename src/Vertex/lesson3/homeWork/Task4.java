package Vertex.lesson3.homeWork;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean b = true;

        System.out.println("Enter two values. And k must be more than n!");

        while (b) {
            System.out.println("Value k:");
            int k = scanner.nextInt();
            System.out.println("Value n:");
            int n = scanner.nextInt();

            if (k > n) {
                noReturnValue(k, n);
                b = false;
            } else {
                System.out.println("You entered wrong values! Repeat, please.");
            }

        }
        scanner.close();
    }

    /**
     * This method prints integer values from k to n.
     * Numbers that are divisible by 2.
     */
    private static void noReturnValue(int a, int b) {

        while (a >= b) {
            if (a%2 == 0) {
                System.out.println(a+ "   ");
            }
            a--;
        }

    }
}
