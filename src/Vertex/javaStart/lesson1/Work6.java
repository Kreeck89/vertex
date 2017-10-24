package Vertex.javaStart.lesson1;

import java.util.Scanner;

public class Work6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of distance");
        int num = scanner.nextInt();

       /* switch (num){
            case 1:
                System.out.println("Your distance is 1 km");
                break;
            case 2:
                System.out.println("Your distance is 2 km");
                break;
                default:
                    System.out.println("You enter wrong number");
                break;*/

        if (num == 1) {
            System.out.println("Your distance is 1 km");
        } else if (num == 2) {
            System.out.println("Your distance is 2 km");
        } else {
            System.out.println("You enter wrong number");
        }
        scanner.close();
    }
}
