package Vertex.javaStart.lesson1.homeWork;

import java.util.Scanner;

public class Task13 {

    /**
     * Looks on entered values and checks it`s even or odd.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberName = scanner.nextInt();

        if (numberName % 2 == 0) {
            System.out.println(numberName + " is an even number");
        } else {
            System.out.println(numberName+ " is odd number");
        }
        scanner.close();
    }
}
