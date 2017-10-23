package Vertex.lesson1.homeWork;

import java.util.Scanner;

public class Task29 {

    /**
     * enter four-digit number. And checks your number for contains "0".
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xx = scanner.nextInt();

        if (xx > 999 & xx < 10000) {
            String ss = String.valueOf(xx);
            if (ss.contains("0")) {
                System.out.println("It`s number have 0");
            } else {
                System.out.println("Don`t have 0 in number");
            }
        } else {
            System.out.println("You wrote wrong number");
        }
        scanner.close();
    }
}
