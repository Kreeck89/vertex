package Vertex.javaStart.lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Creates some array. And enters values with Scanner or Random(u chose).
 */
public class LengthArrAndEnter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter new Array`s length:");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Chose type for load:\n" +
                "1 - For Random:\n" +
                "2 - For use Scanner:");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = 1 + random.nextInt(99);
                }
                break;
            case 2:
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = scanner.nextInt();
                }
                break;
                default:
                    System.out.println("You entered wrong values for Load!");
                    break;
        }
        System.out.println(Arrays.toString(arr));
        scanner.close();
    }
}
