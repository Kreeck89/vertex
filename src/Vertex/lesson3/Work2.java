package Vertex.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
    prinText();
    prinGiveText(s);
        System.out.println(printReturn());

        System.out.println(Arrays.toString(mass(12)));

        System.out.println(twoValuesSumm(12, 3));

        System.out.println(trueFalse(48));

        notReturn(12, 45);

        System.out.println(bool(5, 9));

        System.out.println(tripleMeth(10));

    }


    private static void prinText() {
        System.out.println("Some Text");
    }

    private static void prinGiveText(String text) {
        System.out.println(text);
    }

    private static int printReturn() {
        int a = 15;
        return a;
    }

    private static int [] mass(int a) {
        int arr[] = new int[a];
        return arr;
    }

    private static double twoValuesSumm(double a, double b) {
        double x = a + b;
        return x;
    }

    private static boolean trueFalse (int a) {
        int Const = 100;
        if (a < Const) {
            return true;
        } else {
            return false;
        }
    }
    private static void notReturn(int x, int y) {
        System.out.println(x + y);
    }

    private static boolean bool(int z, int k) {
        return z < k;
    }

    private static double tripleMeth(int a) {    //Method in the method
        double b = 22.6;
        double d = twoValuesSumm(a, b);
        d += 10;
        return d;
    }
}
