package Vertex.javaStart.lesson1.homeWork;

import java.util.Scanner;

public class Task31 {

    /**
     * Check entered value for int. And print valueOf().
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer number");
        if (scanner.hasNextInt()) {
            int in = scanner.nextInt();
            String rez = String.valueOf(in);
            System.out.println(rez);
        } else {
            System.out.println("You enter not right value");
        }
        scanner.close();
    }
}
