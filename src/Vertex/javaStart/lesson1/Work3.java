package Vertex.javaStart.lesson1;

import java.util.Scanner;

public class Work3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int currentYear = 2017;
        int year = scanner.nextInt();

        if (year == currentYear) {
            System.out.println("you write good year");
        } else {
            System.out.println("you write wrong year");
        }
        scanner.close();
    }
}
