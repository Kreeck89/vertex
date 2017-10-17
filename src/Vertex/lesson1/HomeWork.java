package Vertex.lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
       // Scanner задача1:
        Scanner scanner = new Scanner(System.in);
 /*       int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println(n2 + " " + n1);

        //Scanner задача2:
        int nu1 = scanner.nextInt();
        int nu2 = scanner.nextInt();
        System.out.println(nu1 + nu2);

        //Работа с дробными числами
        //задача5
        double a = 12.7;
        int a2 = (int) a;
        System.out.println(a2);

        //Задача6
        double uah = 50.45;
        int i = (int) uah;
        double kop = uah - i;
        System.out.println(kop);

        //Задача7
        double price = 10.5;
        double money = 150.0;
        int number = (int)(money / price);
        double salary = money - number * price;
        System.out.println(salary);

        //Задача8
        int n = 22;
        int first = n/10;
        System.out.println(first);
*/
        //Задача9
        double d = 23.91;
        int t = (int) d;
        System.out.println((int)((d-t)*100));

        //if = задача1 решена в примере;
        //if = задача2:

    /*    int ch1 = scanner.nextInt();
        int ch2 = scanner.nextInt();
        if (ch1 > ch2) {
            System.out.println("biggest number is " + ch1);
        }
        else if (ch1 < ch2) {
            System.out.println("biggest number is " + ch2);
        }
        else {
            System.out.println(ch1 + " = " + ch2);
        }

        //if = задача3:

        int numberName = scanner.nextInt();
        if (numberName % 2 == 0) {
            System.out.println(numberName + " is an even number");
        } else {
            System.out.println(numberName+ " is odd number");
        }

        //if = задача 5:

        int[] arr = new int[3];
        for (int j = 0; j<arr.length; j++) {
            arr[j] = scanner.nextInt();
        }
        int big = arr[0];
        for (int k = 1; k<arr.length; k++) {
            if (big < arr[k]) {
                big = arr[k];
            }
        }
        System.out.println(big);

        //if = задача 6:

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age <= 6) {
            System.out.println("You can play a games");
        }
        else if (age > 6 & age <= 16) {
            System.out.println("Go to school");
        }
        else if (age > 16 & age <= 24) {
            System.out.println("Go to the university");
        }
        else if (age > 24 & age <= 60) {
            System.out.println("Go to your job");
        }
        else if (age > 60) {
            System.out.println("You are pensioner");
        }


        //if = задача 8:
        int x = scanner.nextInt();
        if (x > 9 & x < 100) {

            System.out.println(x / 10);
        }
        else {
            System.out.println("You entered not two-digit number");
        }


        //if = задача 9:

        int xx = scanner.nextInt();
        if (xx > 999 & xx < 10000) {
            String ss = String.valueOf(xx);
            if (ss.contains("0")) {
                System.out.println("It`s number have 0");
            } else {
                System.out.println("Don`t have 0 in number");
            }
        }
        else {
            System.out.println("You wrote wrong number");
        }


        //if = задача 10:

        if (scanner.hasNextInt()) {
            if (scanner.hasNextInt()) {
                int xxx = scanner.nextInt();
                int yyy = scanner.nextInt();
                int non = xxx;
                xxx = yyy;
                yyy = non;
                System.out.println(xxx + " " + yyy);
            }
        }

        //if = задача 11:

        System.out.println("Enter an Integer number");
        if (scanner.hasNextInt()) {
            int in = scanner.nextInt();
            String rez = String.valueOf(in);
            System.out.println(rez);
        }
        else {
            System.out.println("You enter not right value");
        }*/
    }
}
