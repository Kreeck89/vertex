package Vertex.lesson2;

import java.util.Scanner;

public class Work6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mass value");
        int mass[] = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scanner.nextInt();
        }
        for (int j = 0; j < mass.length; j++) {

            System.out.println(mass[j]);
        }
    }
}
