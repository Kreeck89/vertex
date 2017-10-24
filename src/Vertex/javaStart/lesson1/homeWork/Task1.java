package Vertex.javaStart.lesson1.homeWork;

import java.util.Scanner;

public class Task1 {

    /**
     * Enter 2 int values. And print second then first.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println(n2 + " " + n1);
        scanner.close();
    }

    public static class Task6 {

        /**
         * Found cents from value and print.
         */
        public static void main(String[] args) {
            double uah = 50.46;
            int k = (int) uah;
            double kop = uah - k;
            System.out.println(kop);
        }
    }
}
