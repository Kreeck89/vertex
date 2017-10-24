package Vertex.javaStart.lesson1.homeWork;

import java.util.Scanner;

public class Task30 {

    /**
     * Enter some values - check has it int? And changes in place.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            if (scanner.hasNextInt()) {
                int xxx = scanner.nextInt();
                int yyy = scanner.nextInt();
                int non = xxx;
                xxx = yyy;
                yyy = non;
                System.out.println(xxx + " " + yyy);
            }
        }
        scanner.close();
    }
}
