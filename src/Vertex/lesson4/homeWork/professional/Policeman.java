package Vertex.lesson4.homeWork.professional;

import Vertex.lesson4.homeWork.animals.Animals;
import Vertex.lesson4.homeWork.people.Man;
import Vertex.lesson4.homeWork.someThings.Car;
import Vertex.lesson4.homeWork.someThings.House;

public class Policeman extends Man {

    Car car;
    House house;
    Animals animals;

    /**
     * Print some text.
     */
    public static void power() {
        System.out.println("Has a great Power!!!");
    }

    @Override
    public void maleFeature() {
        System.out.println("Have good vitality!");
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
