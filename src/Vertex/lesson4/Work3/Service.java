package Vertex.lesson4.Work3;

public class Service {

    private String size;

    public static void driver() {
        System.out.println("Can drive with you anywhere");
    }

    void exit() {
        System.out.println("You can exit in Kiev");
    }

    protected int roadLength() {
        int x = 1000;
        return x;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
