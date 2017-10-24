package Vertex.javaStart.lesson5;

public class Gipotenuza {

    public static void main(String[] args) {
        int katet1 = 3;
        int katet2 = 4;
        System.out.println(gipoten(katet1, katet2));
    }

    private static int gipoten(int a, int b) {
        int g = a * a + b * b;
        return g;
    }
}
