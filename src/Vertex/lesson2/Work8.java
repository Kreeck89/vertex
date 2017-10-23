package Vertex.lesson2;

public class Work8 {

    public static void main(String[] args) {
        int mass1[] = new int[5];
        int mass2[] = {1, 2, 3, 4, 12};

        for (int i = 0; i <mass1.length ; i++) {
            mass1[i] = mass2[i];
        }
        for (int i = 0; i <mass2.length ; i++) {
            System.out.println(mass2[i]);
        }
    }
}
