package Vertex.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = scanner.nextInt();
        int lim = n / 2;
        int mas[] = new int[n];

        lim *= -1;
        if (n % 2 != 0) {
            for (int i = 0; i < mas.length; i++) {
                mas[i] = Math.abs(lim);
                lim++;
            }
        } else {
            lim += 1;
            for (int i = 0; i < mas.length; i++) {
                mas[i] = Math.abs(lim);
                if (mas[i] == 0) {
                    mas[i + 1] = mas[i];
                    i++;
                }
                lim++;
            }
        }
        System.out.println(Arrays.toString(mas));
        scanner.close();
    }
}
