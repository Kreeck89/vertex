package Vertex.javaStart.lesson6.Work3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class SaveAndRead {

    private static final String SCHOOL = "Vertex";

    public static void main(String[] args) throws Exception {

        final Human user = new Human("Alex", "Smith", "Vertex", 22);

        final String fileName = "src/Vertex/javaStart/resources/SaveAndread.txt";
        final File file = new File(fileName);
        FileWriter writer = new FileWriter(file, true);
        writer.write(user.toString());

        writer.flush();
        writer.close();


        FileReader reader = new FileReader(file);
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }


/*        int data;
        while ((data = reader.read()) != -1) {
            System.out.print((char) data);
        }*/

        reader.close();
    }
}
