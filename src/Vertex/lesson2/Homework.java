package Vertex.lesson2;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w;
        int h;
        char c ='*';
        System.out.println("Enter width some rectangle");
        w = scanner.nextInt();
        System.out.println("Enter high this rectangle");
        h = scanner.nextInt();

        System.out.println("Your rectangle:");

            for (int j = 0; j < w; j++) {
                System.out.print(c);
            }
        System.out.println("");

        for (int i = 1; i < h - 1; i++) {
            for (int j = 0; j < w; j++) {

                if ((j == 0)|| (j == w - 1)) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int j = 0; j < w; j++) {
            System.out.print(c);
        }
        System.out.println("");
    }
}
