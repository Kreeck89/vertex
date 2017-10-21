package Vertex.lesson4.homeWork.professional;

import Vertex.lesson4.homeWork.animals.Animals;
import Vertex.lesson4.homeWork.people.Woman;
import Vertex.lesson4.homeWork.someThings.Car;
import Vertex.lesson4.homeWork.someThings.House;

public class SomeWorker extends Woman {

    Car car;
    House house;
    Animals animals;

    public static String work() {
        return "Can work in different directions!";
    }

    @Override
    public void femaleFeature() {
        System.out.println("I`m a yang woman)");
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Animals getAnimals() {
        return animals;
    }

    public void setAnimals(Animals animals) {
        this.animals = animals;
    }
}
