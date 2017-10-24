package Vertex.javaStart.lesson2;

import java.util.Scanner;

public class Work1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name");
        String me = scanner.nextLine();

        System.out.println("Enter num rep");
        int rep = scanner.nextInt();
        int num = 0;

        for (int i = 0; i < rep; i++) {
            System.out.println(me);
            num++;
        }
        System.out.println("Your name printed is: " + num);
        scanner.close();
    }
}
