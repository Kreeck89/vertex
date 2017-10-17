package Vertex.lesson1;

import java.util.Scanner;


public class Work4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("enter surname");
        String surname = scanner.nextLine();
        System.out.println("enter age");
        int age = scanner.nextInt();
        System.out.println("enter high");
        int high = scanner.nextInt();

        System.out.println("Enter second name");
        String name2 = scanner.nextLine();
        System.out.println("Enter second surname");
        String surname2 = scanner.nextLine();
        System.out.println("Enter second person age");
        int age2 = scanner.nextInt();
        System.out.println("Enter high second person");
        int high2 = 165;

        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println(name + " " + surname + " " + age + " " + high);
        }
        else if (num ==2) {
            System.out.println(name2 + " " + surname2 + " " + age2 + " " + high2);
        }
    }
}
