package Vertex.lesson1.homeWork;

import java.util.Scanner;

public class Task12 {

    /**
     * Enter 2 values and find what is biggest
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch1 = scanner.nextInt();
        int ch2 = scanner.nextInt();

        if (ch1 > ch2) {
            System.out.println("biggest number is " + ch1);
        } else if (ch1 < ch2) {
            System.out.println("biggest number is " + ch2);
        } else {
            System.out.println(ch1 + " = " + ch2);
        }
        scanner.close();
    }
}
