package Vertex.lesson2;

import java.util.Scanner;

public class Work10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int found = 7;
        int arr[] = new int[10];
        System.out.println("Enter the number");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == found) {
                System.out.println("We found systems number");
                return;
            }
        }
        System.out.println("Broke program");
        scanner.close();
    }
}
