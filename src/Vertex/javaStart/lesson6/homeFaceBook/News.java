package Vertex.javaStart.lesson6.homeFaceBook;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class News {

    static void chooseNews() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter what news you want to see, please: ");
        System.out.println("Press 1: If you want see your friends news." +
                "\nPress 2: For watching music news." +
                "\nPress 3: If you want see new video." +
                "\nPress 4: For look all news." +
                "\nPress 5: If you like sport.");
//        int num = scanner.nextInt();
        switch (scanner.nextInt()) {
            case 1:
                String link1 = "https://face-b.com/friend_news";
                someNews(link1);
                break;
            case 2:
                String link2 = "https://face-b.com/music_news";
                someNews(link2);
                break;
            case 3:
                String link3 = "https://face-b.com/new_video";
                someNews(link3);
                break;
            case 4:
                String link4 = "https://face-b.com/World_news";
                someNews(link4);
                break;
            case 5:
                String link5 = "https://face-b.com/sports_news";
                someNews(link5);
                break;
            default:
                System.out.println("You entered wrong number.");
                break;
        }
    }

    /**
     * Loading choose news from 5 links.
     */
    private static void someNews(String link) throws IOException {
        File file = new File(link);
        FileReader reader = new FileReader(file);
        int data;
        while ((data = reader.read()) != -1) {
            System.out.println((char) data);
        }
        reader.close();
    }
}
