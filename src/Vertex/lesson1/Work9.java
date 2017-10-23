package Vertex.lesson1;

import java.util.Random;
import java.util.Scanner;

public class Work9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int value = 1 + random.nextInt(9);
        int num = 0;
        while (num != value) {
            num = scanner.nextInt();
        }
        System.out.println(num + " = " + value);
        scanner.close();
    }
}
