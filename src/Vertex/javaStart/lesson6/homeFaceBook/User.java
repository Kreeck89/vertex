package Vertex.javaStart.lesson6.homeFaceBook;

public class User extends DeskTop {

    private int age;
    private int phone;
    private boolean sex;
    private String name;
    private String surName;
    private String eMail;
    private String address;

    public User() {
    }

    public User(int age, int phone, boolean sex, String name, String surName, String eMail, String address) {
        this.age = age;
        this.phone = phone;
        this.sex = sex;
        this.name = name;
        this.surName = surName;
        this.eMail = eMail;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name: " + getName()
                + "\nsurname: " + getSurName()
                + "\nage: " + getAge()
                + "\ne-mail: " + geteMail()
                + "\nphone: " + getPhone()
                + "\naddress: " + getAddress();
    }
}
