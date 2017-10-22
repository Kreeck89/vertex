package Vertex.lesson4.homeWork.homeProject1;

import Vertex.lesson4.homeWork.homeProject1.animals.Animals;
import Vertex.lesson4.homeWork.homeProject1.profession.Doctor;
import Vertex.lesson4.homeWork.homeProject1.profession.Fireman;
import Vertex.lesson4.homeWork.homeProject1.profession.Policeman;
import Vertex.lesson4.homeWork.homeProject1.profession.SomeWorker;
import Vertex.lesson4.homeWork.homeProject1.someThings.Car;
import Vertex.lesson4.homeWork.homeProject1.someThings.House;

public class Main {

    public static void main(String[] args) {
        Car carOfDoctor = new Car("Toyota", "black", 8, 2009, 5);
        House housePoliceman = new House("KMB", 12, 100_000);
        Animals animalsCat = new Animals("Bengal", "Monrik", true, 2);
        Animals animalsDog = new Animals("Mops", "Bonny", true, 5);
        Animals animalsBird = new Animals();

        Doctor doctor = new Doctor();
        Fireman fireman = new Fireman();
        Policeman policeman = new Policeman();
        SomeWorker someWorker = new SomeWorker();

        animalsBird.setName("Vilson");
        animalsBird.setSex(false);
        animalsBird.setAge(3);

        animalsCat.setSize(Animals.getSizeSmall());
        animalsDog.setSize(Animals.getSizeLarge());
        animalsBird.setSize(Animals.getSizeSmall());

        doctor.setName("Bonni");
        doctor.setSurname("Villiams");
        doctor.setCountryBurn("USA");
        doctor.setAge(40);
        doctor.setSex(false);
        doctor.setCar(carOfDoctor);
        doctor.setAnimals(animalsCat);

        System.out.println("We need to know What was born height this man: ");
        int h = doctor.height();

        System.out.println(doctor.toSt());
        System.out.println(doctor.getCar());
        System.out.println(doctor.getAnimals());
        System.out.println("Doctor`s height is: " + h);
        doctor.feature();

        System.out.println();
        System.out.println();
        System.out.println();

        fireman.setName("Freddy");
        fireman.setSurname("Branch");
        fireman.setSex(true);

        System.out.println(fireman.toSt());
        System.out.println(fireman.fire());
        fireman.maleFeature();

        System.out.println();
        System.out.println();
        System.out.println();

        policeman.setName("Jhon");
        policeman.setSurname("Macclain");
        policeman.setCountryBurn("Canada");
        policeman.setAge(33);
        policeman.setSex(true);
        policeman.setHouse(housePoliceman);
        policeman.setAnimals(animalsDog);

        System.out.println(policeman.toSt());
        System.out.println(policeman.getHouse());
        System.out.println(policeman.getCar());
        System.out.println(policeman.getAnimals());
        policeman.power();
        policeman.maleFeature();
        policeman.parents(); // Если раскоментировать scaner.close() в Human, то программа вылетает!!!
        policeman.loveBeer();


        System.out.println();
        System.out.println();
        System.out.println();

        someWorker.setName("Janny");
        someWorker.setAge(18);
        someWorker.setSex(false);
        someWorker.setAnimals(animalsBird);
        String work = someWorker.work();
        System.out.println(someWorker.toSt());
        System.out.println(someWorker.getHouse());
        System.out.println(someWorker.getCar());
        System.out.println(someWorker.getAnimals());
        System.out.println(work);
        someWorker.femaleFeature();

    }

}
