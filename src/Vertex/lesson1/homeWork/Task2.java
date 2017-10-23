package Vertex.lesson1.homeWork;

import java.util.Scanner;

public class Task2 {

    /**
     * Enter 2 int values and print their sum.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int sum = n1 + n2;
        System.out.println(sum);
        scanner.close();
    }
}
