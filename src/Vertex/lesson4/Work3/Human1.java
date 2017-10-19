package Vertex.lesson4.Work3;

public class Human1 extends Service {

    private String color;

    public static void main(String[] args) {

        Human1 human1 = new Human1();

        human1.driver();
        human1.exit();
        System.out.println(human1.roadLength());
        human1.setColor(Const.BLACK);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
