package Vertex.lesson4.homeWork;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text:");

        String s = scanner.nextLine();

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            System.out.println("First and last characters are equals");
        } else {
            System.out.println("First and last characters are not equals");
        }
        scanner.close();
    }
}
