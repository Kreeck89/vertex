package Vertex.lesson4.homeWork;

import Vertex.lesson4.homeWork.professional.Doctor;
import Vertex.lesson4.homeWork.someThings.Car;
import Vertex.lesson4.homeWork.someThings.House;

public class Main {
    public static void main(String[] args) {
        Car carOfDoctor = new Car("Toyota", "black", 8, 2009, 5);
        House house = new House("KMB", 12, 100_000);

        Doctor doctor = new Doctor();
        doctor.setName("George");
        doctor.setSurname("Vlasov");
        doctor.setCar(carOfDoctor);

        System.out.println(doctor.getName());

        doctor.setName("b");
        System.out.println(doctor.getName());
    }

}
