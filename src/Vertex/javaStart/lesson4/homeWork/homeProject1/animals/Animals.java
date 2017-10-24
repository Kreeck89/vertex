package Vertex.javaStart.lesson4.homeWork.homeProject1.animals;

public class Animals {

    private String kind;
    private String name;
    private boolean sex;
    private int age;
    private String size;

    private static final String sizeSmall = "SMALL";
    private static final String sizeLarge = "LARGE";

    public String getKind() {
        return kind;
    }

    /**
     * Constructor for enter all values of animal.
     */
    public Animals(String kind, String name, boolean sex, int age) {
        this.kind = kind;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    /**
     * Free constructor.
     */
    public Animals() {
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static String getSizeSmall() {
        return sizeSmall;
    }

    public static String getSizeLarge() {
        return sizeLarge;
    }

    /**
     * For prints values some animals.
     */
    @Override
    public String toString() {
        return "My animal kind is: " + getKind()
                + "\nHis name is: " + getName()
                + "\nTrue - it`s man, false - woman: " + isSex()
                + "\nAnd age is: " + getAge()
                + "\nSize: " + getSize();
    }
}
