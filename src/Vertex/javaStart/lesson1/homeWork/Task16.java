package Vertex.javaStart.lesson1.homeWork;

import java.util.Scanner;

public class Task16 {

    /**
     * Print some text depending on the age.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        if (age <= 6) {
            System.out.println("You can play a games");
        }
        else if (age > 6 & age <= 16) {
            System.out.println("Go to school");
        }
        else if (age > 16 & age <= 24) {
            System.out.println("Go to the university");
        }
        else if (age > 24 & age <= 60) {
            System.out.println("Go to your job");
        }
        else if (age > 60) {
            System.out.println("You are pensioner");
        }
        scanner.close();
    }
}
