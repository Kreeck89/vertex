package Vertex.lesson4.homeWork;

import Vertex.lesson4.homeWork.animals.Animals;
import Vertex.lesson4.homeWork.professional.Doctor;
import Vertex.lesson4.homeWork.professional.Fireman;
import Vertex.lesson4.homeWork.professional.Policeman;
import Vertex.lesson4.homeWork.professional.SomeWorker;
import Vertex.lesson4.homeWork.someThings.Car;
import Vertex.lesson4.homeWork.someThings.House;

public class Main {
    public static void main(String[] args) {
        Car carOfDoctor = new Car("Toyota", "black", 8, 2009, 5);
        House housePliceman = new House("KMB", 12, 100_000);
        Animals animalsCat = new Animals();
        Animals animalsDog = new Animals();
        Animals animalsBird = new Animals();

        Doctor doctor = new Doctor();
        Fireman fireman = new Fireman();
        Policeman policeman = new Policeman();
        SomeWorker someWorker = new SomeWorker();

        doctor.setName("George");
        doctor.setSurname("Vlasov");
        doctor.setCar(carOfDoctor);

        System.out.println(doctor);

        doctor.setName("b");
        System.out.println(doctor.getName());

        doctor.test();


    }

}
