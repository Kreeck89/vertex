package Vertex.lesson4.homeWork.people;

import java.util.Scanner;

public class Human {

    private String name;
    private String surname;
    private String countryBurn;
    private int age;
    private boolean sex;

    public static int hight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your hight burn:");
        int age = scanner.nextInt();
        scanner.close();
        return age;
    }

    public static String parents() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you parents names: \n Mother ");
        String m = scanner.nextLine();
        System.out.println("Father");
        String f = scanner.nextLine();
        scanner.close();
        return "Your mother is: " + m + " And father is: " + f;
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
