package Vertex.javaStart.lesson4.Work2;

public class CarAveo extends CarLexus {

    public static void main(String[] args) {
        CarAveo aveo = new CarAveo();
        aveo.drivSomeKm();
        aveo.lengthRoad();
    }

    @Override
    public void drivSomeKm() {
        System.out.println("Can moving over 50km");
    }

    @Override
    public String lengthRoad() {
        String length = "ever 500km";
        return length;
    }
}
