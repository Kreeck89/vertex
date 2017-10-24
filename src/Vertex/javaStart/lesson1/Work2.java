package Vertex.javaStart.lesson1;

public class Work2 {

    public static void main(String[] args) {
        final int currentYear = 2017;
        final int a = 2010;
        final int b = 2015;
        final int c = 2020;

        if (currentYear > a && currentYear < b) {
            System.out.println(currentYear + " in this ranges");
        } else if (currentYear > b && currentYear < c) {
            System.out.println(currentYear + " in second ranges");
        }
    }
}
