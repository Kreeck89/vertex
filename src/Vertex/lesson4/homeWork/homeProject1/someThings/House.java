package Vertex.lesson4.homeWork.homeProject1.someThings;

import java.util.Scanner;

public class House {

    private static String builder;
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

      public House(String builder, int size, int prise) {
          this.builder = builder;
          this.size = size;
          this.prise = prise;
      }

    @Override
    public String toString() {
        return "It`s builder is: " + getBuilder()
                + "\nHis size is: " + getSize()
                + "\nPrise for bought it: " + getPrise();
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

    public static String getBuilder() {
        return builder;
    }

    public static void setBuilder(String builder) {
        House.builder = builder;
    }
}
