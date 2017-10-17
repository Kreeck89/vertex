package Vertex.lesson1;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name and how old are you?");

        String name = scanner.nextLine();
        int age = scanner.nextInt();

        System.out.println("Your name " + name);
        System.out.println("Your age is " + age);

        System.out.println("And write your year burn");

        int year = scanner.nextInt();

        scanner.close();
        System.out.println("You burn in " + year);
    }
}
