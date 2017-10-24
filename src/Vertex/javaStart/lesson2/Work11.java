package Vertex.javaStart.lesson2;

public class Work11 {

    public static void main(String[] args) {
        int mass[] = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i + 1;
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 2 | mass[i] == 3 | mass[i] == 4 | mass[i] == 5) {
                mass[i] = 12;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                System.out.println(mass[i]);
            }
        }
    }
}
