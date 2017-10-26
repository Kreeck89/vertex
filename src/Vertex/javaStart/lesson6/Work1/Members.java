package Vertex.javaStart.lesson6.Work1;

import java.util.Scanner;

public class Members {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("Aleksandr");
        user1.setName("Kiev");
        user1.setB(true);

        System.out.println("User`s name is " + user1.getName()
                + "City Live is " + user1.getCity()
                + "Do u love 1715 beer? " + user1.isB());

        if (user1.isB()) {
            System.out.println("User`s likes beer is: " + whatBeer());
        }
    }

    private static String whatBeer() {
        Scanner scanner = new Scanner(System.in);
            System.out.println("What beer you like?");
        String beer = scanner.nextLine();
        scanner.close();
        return beer;
    }
}
