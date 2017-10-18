package Vertex.lesson3;

import java.util.Scanner;

public class HomeWorkWithStringChar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        int n2 = scanner.nextInt();
        char c = 'c';

        if (s.contains("o")) {
            System.out.println(s.indexOf("o"));
        } else {
            System.out.println(s.length());
        }

        System.out.println(Math.nextUp(n));
        System.out.println(s.toString());

        for (int i = 0; i <s.length() ; i++) {

            System.out.print(s.charAt(i) + "  ");
            System.out.println();
        }

            if (s.contains("a")) {
                String ss = s.replaceAll("a", "111");
                System.out.println(ss);
            }

//        String ss = String.valueOf(s.indexOf("b"));
//        int num = Integer.parseInt(ss);
        int w = s.indexOf("a");
        n2 += w;
        System.out.println(n2);

        int sss = s.length();
        n += sss;
        System.out.println(n);


        String sNew = s.replaceAll("a", "A");
        System.out.println(sNew);

        String trim = "        Trim-Test      ";
        System.out.println(trim.trim());

        String n1 = s.valueOf(n);
        int n3 = s.indexOf("b");

        System.out.println(n1);
        System.out.println(n3);
    }
}
