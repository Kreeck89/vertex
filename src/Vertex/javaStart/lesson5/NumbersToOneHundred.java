package Vertex.javaStart.lesson5;

/**
 * Print numbers in ranges 1-10 & 40-50 & 70-80.
 */
public class NumbersToOneHundred {

    public static void main(String[] args) {
        int num = 1;
        while (num <= 100) {
            if (num > 0 & num <= 10 | num >= 40 & num <= 50 | num >= 70 & num <= 80) {
                System.out.println(num);
            }
            num++;
        }
    }
}
