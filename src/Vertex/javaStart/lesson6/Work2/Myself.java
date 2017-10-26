package Vertex.javaStart.lesson6.Work2;

public class Myself {

    private String name;
    private String surName;
    private String pSchool;
    private int age;

    public Myself(String name, String surName, String pSchool, int age) {
        this.name = name;
        this.surName = surName;
        this.pSchool = pSchool;
        this.age = age;
    }

    public Myself(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    Myself() {
    }

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

    public String getpSchool() {
        return pSchool;
    }

    public void setpSchool(String pSchool) {
        this.pSchool = pSchool;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name is " + getName()
                + "\nsurName is " + getSurName()
                + "\nHis studies school is " + getpSchool()
                + "\nAnd age " + getAge();
    }
}
