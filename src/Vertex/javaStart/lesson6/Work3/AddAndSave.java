package Vertex.javaStart.lesson6.Work3;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AddAndSave {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerAge = new Scanner(System.in);
        ArrayList<Human> arrayList = new ArrayList<>();

        System.out.println("Enter 3 Humans: ");
        for (int i = 0; i < 3; i++) {
            arrayList.add(new Human());

            System.out.println("Enter your first name new User: ");
            arrayList.get(i).setFirstName(scanner.nextLine());

            System.out.println("Enter your last name new User: ");
            arrayList.get(i).setLastName(scanner.nextLine());

            System.out.println("Enter your profession new User: ");
            arrayList.get(i).setProfession(scanner.nextLine());

            System.out.println("Enter your age new User: ");
            arrayList.get(i).setAge(scannerAge.nextInt());
        }
        printArray(arrayList);
        scanner.close();
        scannerAge.close();
    }

    private static void printArray(ArrayList arrayList) throws Exception {
        String fileName = "src/Vertex/javaStart/resources/file.txt";
        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(file);

        for (int i = 0; i < arrayList.size(); i++) {
            String nUser = "User" + (i + 1) + "\n";
            fileWriter.write(nUser);
            fileWriter.write(arrayList.get(i).toString() + "\n\n");
        }
        fileWriter.close();
    }
}
