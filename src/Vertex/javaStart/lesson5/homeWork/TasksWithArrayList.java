package Vertex.javaStart.lesson5.homeWork;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Task4: Creates ArrayList with Integer. Enter Random values to array;
 * Task5: Prints ArrayList example [0] = 10
 *                                 [1] = 20....;
 * Task6: Create method "get Count Element By ArrayList".
 */
public class TasksWithArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter value for ArrayList length: ");
        int n = scanner.nextInt();
        int wanted;
        enterArray(list, n);
        printArray(list);

        System.out.println("Enter wonted number: ");
        wanted = scanner.nextInt();
        System.out.println("Wanted elements is :" + getCountElement(list, wanted));
        scanner.close();
    }

    private static void enterArray(ArrayList list, int n) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(1 + random.nextInt(9));
        }
    }

    private static void printArray(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + i + "] = " + list.get(i));
        }
    }

    private static int getCountElement(ArrayList list, int wanted) {
        int quantity = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((int) list.get(i) == wanted) {
                quantity++;
            }
        }
        return quantity;
    }
}
