package Vertex.javaStart.lesson5.homeWork;

import java.io.FileWriter;
import java.util.Scanner;

/**
 * You enters some values.
 */
public class FileWrit {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = "/Users/ozzy/IdeaProjects/vertex/src/Vertex/javaStart/lesson5/homeWork/task1.txt";
        FileWriter fileWriter = new FileWriter(fileName);
        System.out.println("Enter two values for write to file: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        while (n1 != n2) {
            if (n1 > n2) {
                fileWriter.write(n1 + "\n");
                n1--;
            } else {
                fileWriter.write(n1 + "\n");
                n1++;
            }
        }
        scanner.close();
        fileWriter.close();
    }
}
