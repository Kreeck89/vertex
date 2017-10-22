package Vertex.lesson4.homeWork.homeProject1.profession;

import Vertex.lesson4.homeWork.homeProject1.animals.Animals;
import Vertex.lesson4.homeWork.homeProject1.people.Woman;
import Vertex.lesson4.homeWork.homeProject1.someThings.Car;
import Vertex.lesson4.homeWork.homeProject1.someThings.House;

public class SomeWorker extends Woman {

    Car car;
    House house;
    Animals animals;

    /**
     * Return some text.
     */
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
