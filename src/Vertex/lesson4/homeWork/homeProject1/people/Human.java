package Vertex.lesson4.homeWork.homeProject1.people;

import java.util.Scanner;

public class Human {

    private String name;
    private String surname;
    private String countryBurn;
    private int age;
    private boolean sex;

    /**
     * Ask height growth at birth.
     */
    public static int height() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your growth at born:");
        int age = scanner.nextInt();
//        scanner.close();
        return age;
    }

    /**
     * Ask parents names and return his names.
     */
    public static void parents() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you parents names: \nMother: ");
        String m = scanner.nextLine();
        System.out.println("Father: ");
        String f = scanner.nextLine();
        scanner.close();
        System.out.println("Your mother is: " + m + " And father is: " + f);
    }

    /**
     * For prints information about users.
     */
    public String toSt() {
        return "Name: " + getName()
                + "\nSurname: " + getSurname()
                + "\nWhere was he/she born: " + getCountryBurn()
                + "\nYour age: " + getAge()
                + "\nWhat is your sex? (true = man, false = woman): " + isSex();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountryBurn() {
        return countryBurn;
    }

    public void setCountryBurn(String countryBurn) {
        this.countryBurn = countryBurn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
