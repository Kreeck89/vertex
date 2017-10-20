package Vertex.lesson4.homeWork.someThings;

import java.util.Scanner;

public class House {

    private static String bilder;
    private static int size;
    private int prise;

      public static double plentSize () {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Enter size of plant around your house:");
          double size = scanner.nextDouble();
          scanner.close();
          return size;
      }

      public House() {

      }

      public House(String bilder, int size, int prise) {
          this.bilder = bilder;
          this.size = size;
          this.prise = prise;
      }

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        House.size = size;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public static String getBilder() {
        return bilder;
    }

    public static void setBilder(String bilder) {
        House.bilder = bilder;
    }
}
