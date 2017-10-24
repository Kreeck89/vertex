package Vertex.javaStart.lesson4.homeWork;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two some strings, pls:");
        String s = scanner.nextLine();
        String s1 = scanner.nextLine();

        boolean equals = s1.contains(s);
        System.out.println(equals);

        scanner.close();
    }
}
