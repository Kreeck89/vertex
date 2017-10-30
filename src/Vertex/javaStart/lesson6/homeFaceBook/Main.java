package Vertex.javaStart.lesson6.homeFaceBook;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        User user = new User();
        user.deskWrite();
        user.commits();
        user.likes();
        user.likes();
        user.likes();
        user.deskPrint();
        user.chooseNews();

        scanner.close();
    }
}
