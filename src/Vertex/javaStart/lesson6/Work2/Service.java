package Vertex.javaStart.lesson6.Work2;

import java.io.File;
import java.io.FileWriter;

/**
 * Creates Myself Objects and save his to file.txt. And print some Object...
 */
public class Service {

    public static void main(String[] args) throws Exception {
        String fileName = "src/Vertex/javaStart/resources/file.txt";
        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(file);

        Myself myself1 = new Myself("Oleg", "Bobrov", 22);
        Myself myself2 = new Myself();
        Myself myself3 = new Myself("Marina", "Olegovna", "Vertex", 27);
        Myself myself4 = new Myself();

        myself2.setName("Aleksand");
        myself2.setSurName("Mamonov");
        myself2.setpSchool("VertexAcademy");
        myself2.setAge(35);

        myself1.setpSchool("Vertex");

        fileWriter.write(myself2.toString() + "\n");
        fileWriter.write(myself3.toString() + "\n");
        fileWriter.write(myself4.toString() + "\n");
        fileWriter.close();

        System.out.println(myself1);
        getProgrammingSchool(myself1.getpSchool());
    }

    private static void getProgrammingSchool(String getpSchool) {
        if ("Vertex".equals(getpSchool)) {
            System.out.println("I`m cool programmer!");
        }
    }
}
