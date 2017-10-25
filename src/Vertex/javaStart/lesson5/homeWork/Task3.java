package Vertex.javaStart.lesson5.homeWork;

import java.io.FileWriter;

/**
 * Reads file and adds a line to the text.
 */
public class Task3 {

    public static void main(String[] args) throws Exception {
        String file = "/Users/ozzy/IdeaProjects/vertex/src/Vertex/javaStart/lesson5/homeWork/task3.txt";
        String st = "Some string for add.\n";
        addString(file, st);
    }

    private static void addString(String file, String st) throws Exception {
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append(st);
        fileWriter.flush();
        fileWriter.close();
    }
}
