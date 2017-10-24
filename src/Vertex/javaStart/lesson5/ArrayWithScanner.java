package Vertex.javaStart.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stMass[] = new String[5];
        int arr[] = new int[5];
        System.out.println("Enter values for your Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter values for Strings array:");
        for (int i = 0; i < stMass.length; i++) {
            stMass[i] = scanner1.nextLine();
        }
        System.out.println(Arrays.toString(stMass));
        scanner1.close();
        scanner.close();
    }
}
