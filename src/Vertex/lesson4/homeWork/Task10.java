package Vertex.lesson4.homeWork;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String pS = back(s);

        if (s.equals(pS)) {
            System.out.println("It`s a palindrome");
        }
        scanner.close();
    }

    private static String back(String s) {
        String ss = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }
        return ss;
    }
}
