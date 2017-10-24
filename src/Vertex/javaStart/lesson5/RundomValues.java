package Vertex.javaStart.lesson5;

import java.util.Random;

/**
 * Print 10 ranges (0-100, 100-200....900-1000).
 */
public class RundomValues {

    public static void main(String[] args) {
        Random random = new Random();
        int first = 0;
        int second = 100;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; ) {
                int n = first + random.nextInt(second);
                if (n % 2 == 0) {
                    System.out.print(n + "\t");
                    j++;
                }
            }
            System.out.println();
            first += 100;
        }
    }
}
