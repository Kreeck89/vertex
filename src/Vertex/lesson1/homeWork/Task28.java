package Vertex.lesson1.homeWork;

import java.util.Scanner;

public class Task28 {

    /**
     * To enter two-digit number. And check it.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x > 9 & x < 100) {
            System.out.println(x / 10);
        } else {
            System.out.println("You entered not two-digit number");
        }
        scanner.close();
    }
}
