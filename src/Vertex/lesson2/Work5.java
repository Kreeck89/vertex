package Vertex.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Work5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Enter random number!");
            int uNum = scanner.nextInt();
            int rNum = 1 + random.nextInt(9);
            if (uNum == rNum) {
                System.out.println(uNum + " = " + rNum);
                break;
            }
        }
        scanner.close();
    }
}
