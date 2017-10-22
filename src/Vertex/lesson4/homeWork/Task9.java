package Vertex.lesson4.homeWork;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int l = s.length();
        System.out.println(s.substring(l/2));
        scanner.close();
    }
}
