package Vertex.javaStart.lesson5.homeWork;

import java.io.FileReader;
import java.util.Scanner;

/**
 * Reads strings from some file and count their value.
 */
public class Task2 {

    public static void main(String[] args) throws Exception {
        String fReader = "/User/ozzy/IdeaProjects/vertex/src/Vertex/javaStart/lesson5/homeWork/task2.txt";
        FileReader fileReader = new FileReader(fReader);
        Scanner scanner = new Scanner(fileReader);
        int countStrings = 0;
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            countStrings++;
        }
        System.out.println(countStrings);
        fileReader.close();
        scanner.close();
    }
}
