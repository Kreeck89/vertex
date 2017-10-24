package Vertex.javaStart.lesson5.TaskForMe;

public class User {

    private String name;
    private String surName;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + getName()
                + "\nSurname: " + getSurName()
                +"\nHis age: " + getAge()
                +"\nAnd sex: " + getSex();
    }
}
