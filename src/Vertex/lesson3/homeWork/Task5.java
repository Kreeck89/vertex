package Vertex.lesson3.homeWork;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int a = getInt();
        int b = getInt();
        char c = getOperation();
        System.out.println(calc(a, b, c));
    }

    /**
     * It takes values for the task
     */
    private static int calc(int a, int b, char c) {
        int value = 0;
        if (c == '+') {
            value = a + b;
        } else if (c == '-') {
            value = a - b;
        } else if (c == '*') {
            value = a * b;
        } else if (c == '/') {
            value = a / b;
        }
        return value;
    }

    /**
     * Wat action to take.
     */
    private static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        char c = ' ';
        System.out.println("Enter 1 - if you need '+'");
        System.out.println("Enter 2 - if you need '-'");
        System.out.println("Enter 3 - if you need '*'");
        System.out.println("Enter 4 - if you need '/'");

        int n = scanner.nextInt();
        switch (n) {
            case 1:
                c = '+';
            break;
            case 2:
                c = '-';
                break;
            case 3:
                c = '*';
                break;
            case 4:
                c = '/';
                break;
            default:
            System.out.println("You entered wrong number!");
        }
        return c;
    }

    /**
     * Create new values from keyboard.
     */
    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        return x;
    }
}
