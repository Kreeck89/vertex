package Vertex.javaStart.lesson6.homeFaceBook;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Create you desktop.
 */
public class DeskTop extends Music {

    private int liks = 0;

    /**
     * Save your post for print.
     */
    public void deskWrite() throws IOException {
        String link = "src/Vertex/javaStart/lesson6/homeFaceBook/resourcesFB/desk.txt";
        File file = new File(link);
        FileWriter writer = new FileWriter(file);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("It is your board:");
        writer.write(scanner1.nextLine());
        writer.close();
    }

    /**
     * Comments for your post.
     */
    public void commits () throws IOException {
        Scanner scanner2 = new Scanner(System.in);
        String commitLink = "src/Vertex/javaStart/lesson6/homeFaceBook/resourcesFB/commitLink.txt";
        File file2 = new File(commitLink);
        FileWriter writer2 = new FileWriter(file2, true);
        writer2.write(scanner2.nextLine());
        writer2.close();
    }

    /**
     * Change you likes.
     */
   public void likes() throws IOException {
       int num = this.liks;
       num++;
       this.liks = num;
   }

    /**
     * Print Post with all data about it.
     */
    public void deskPrint() throws IOException {
        String link = "src/Vertex/javaStart/lesson6/homeFaceBook/resourcesFB/desk.txt";
        String commitLink = "src/Vertex/javaStart/lesson6/homeFaceBook/resourcesFB/commitLink.txt";
        File file = new File(link);
        File file2 = new File(commitLink);
        FileReader reader = new FileReader(file);
        FileReader reader2 = new FileReader(file2);
        int data;
        while ((data = reader.read()) != -1) {
            System.out.print((char) data);
        }
        System.out.println("\nComments your post:");
        while ((data = reader2.read()) != -1) {
            System.out.print((char) data);
        }
        System.out.println("\nLikes: " + liks);
        reader.close();
        reader2.close();
    }
}
