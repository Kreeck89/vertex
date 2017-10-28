package Vertex.javaStart.lesson6.Work3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TestWriteReader {

    private static final String SCHOOL = "Vertex";

    public static void main(String[] args) throws Exception {

        final Human human = new Human("Alex", "Smith", "Vertex", 65);

        final String fileName = "src/Vertex/javaStart/resources/SaveAndread.txt";
        final File file = new File(fileName);
        FileWriter writer = new FileWriter(file, true);
        writer.write(human.toString());

        writer.flush();
        writer.close();

        FileReader reader = new FileReader(file);
        int data;
        while ((data = reader.read()) != -1) {
            System.out.print((char) data);
        }
        reader.close();
    }
}
