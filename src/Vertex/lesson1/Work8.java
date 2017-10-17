package Vertex.lesson1;

import java.util.Scanner;

public class Work8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sex;
        int program;
        System.out.println("Hello! Enter your sex");
        sex = scanner.nextLine();


        if (sex.equals("man")) {

            System.out.println("What`s your name, man?");
            String name = scanner.nextLine();
            System.out.println("Go on a beer, " + name);
        } else if (sex.equals("woman")) {

            System.out.println("What`s your name, woman?");
            String name = scanner.nextLine();
            System.out.println("It`s your flower, " + name);
        }
        System.out.println("What is you programs language?");
        System.out.println("Press 1 if it`s java!");
        System.out.println("Press 2 if it`s other languages!");
        program = scanner.nextInt();
        if (program == 1) {

            System.out.println("It a future!!!");
        } else if (program == 2) {
            System.out.println("It`s not good for us!");
        }
    }
}
