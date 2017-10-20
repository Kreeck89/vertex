package Vertex.lesson4.homeWork.animals;

public class Animals {

    private String kind;
    private String name;
    private boolean sex;
    private int age;

    private static final String sizeSmall = "SMALL";
    private static final String sizeLarge = "LARGE";

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getSizeSmall() {
        return sizeSmall;
    }

    public static String getSizeLarge() {
        return sizeLarge;
    }
}
