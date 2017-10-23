package Vertex.lesson1.homeWork;

public class Task7 {

    /**
     * Count how many we can buy and what surrender will be late.
     */
    public static void main(String[] args) {
        double price = 10.5;
        double money = 150;
        int quantity = (int) (money / price);
        double sur = money - quantity * price;
        System.out.println(sur);
    }
}
