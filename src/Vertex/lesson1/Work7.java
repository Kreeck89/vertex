package Vertex.lesson1;

import java.util.Scanner;

public class Work7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numb = scanner.nextLine();

       /* switch (numb) {
            case "BTC":
                System.out.println("salary in btc");
                break;
            case "UAH":
                System.out.println("salary in uah");
            case "USD":
                System.out.println("salary in usd");
                break;
            default:
                System.out.println("u without salary");
                break;*/

        if (numb.equals("BTC")) {
            System.out.println("salary in btc");
        } else if (numb.equals("UAH")) {
            System.out.println("salary in uah");
        } else if (numb.equals("USD")) {
            System.out.println("salary in usd");
        } else
            System.out.println("u without salary");
        scanner.close();
    }
}
