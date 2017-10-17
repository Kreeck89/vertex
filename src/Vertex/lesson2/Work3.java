package Vertex.lesson2;

public class Work3 {
    public static void main(String[] args) {
        int num = 100;
        int a = 1;
        int tracer = 0;
        while (a <= num) {
            if (a % 2 == 0) {
                System.out.println("even " + a);
            }
            else {
                System.out.println("odd " + a);
            }
            a++;
            tracer++;
        }
        System.out.println("Tracer is " + tracer);
    }
}
