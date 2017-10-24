package Vertex.lesson5;

import java.util.Scanner;

public class LessonWork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of classes: ");
        System.out.println("1 - doubleToInt();\n" +
                "2 - intToDouble();\n" +
                "3 - stringToInt();\n" +
                "4 - intToString();\n" +
                "5 - doubleToString();\n" +
                "6 - stringToDouble();\n" +
                "7 - doubleIntString();");
        int n = scanner.nextInt();
            switch (n) {
                case 1:
                    doubleToInt();
                    break;
                case 2:
                    intToDouble();
                    break;
                case 3:
                    stringToInt();
                    break;
                case 4:
                    intToString();
                    break;
                case 5:
                    doubleToString();
                    break;
                case 6:
                    stringToDouble();
                    break;
                case 7:
                    doubleIntString();
                    break;
                    default:
                        System.out.println("You entered wrong number!");
                        break;
            }
        scanner.close();
    }

    private static void doubleToInt() {
        double d = 12.48;
        int x = (int) (d);
        System.out.println(x);
    }

    private static void intToDouble() {
        int x = 12;
        double d = (double) (x);
        System.out.println(d);
    }

    private static void stringToInt() {
        String n = "37";
        int x = Integer.parseInt(n);
        System.out.println(x);
    }

    private static void intToString() {
        int x = 180;
        String n = String.valueOf(x);
        System.out.println(n);
    }

    private static void doubleToString() {
        double d = 12.54;
        String n = String.valueOf(d);
        System.out.println(n);
    }

    private static void stringToDouble() {
        String n = "12.77";
        double d = Double.parseDouble(n);
        System.out.println(d);
    }

    private static void doubleIntString() {
        double d = 12.44;
        int x = (int) (d);
        String n = String.valueOf(x);
        System.out.println(n);
    }
}
