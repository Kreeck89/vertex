package Vertex.javaStart.lesson4.homeWork.homeProject1.someThings;

public class Car {

       private String mark;
       private String color;
       private int age;
       private int yearOld;
       private int size;

       public static void saleCare() {
           System.out.println("It`s car is for sale!");
       }

       public Car(String mark, String color, int age, int yearOld, int size) {
           this.mark = mark;
           this.color = color;
           this.age = age;
           this.yearOld = yearOld;
           this.size = size;
       }

       public Car() {

       }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Mark: " + getMark()
                + "\nColor: " + getColor()
                + "\nage: " + getAge()
                + "\nYearOld: " + getYearOld()
                + "\nSize: " + getSize();
    }
}
