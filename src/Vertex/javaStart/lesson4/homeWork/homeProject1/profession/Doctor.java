package Vertex.javaStart.lesson4.homeWork.homeProject1.profession;

import Vertex.javaStart.lesson4.homeWork.homeProject1.animals.Animals;
import Vertex.javaStart.lesson4.homeWork.homeProject1.people.Woman;
import Vertex.javaStart.lesson4.homeWork.homeProject1.someThings.Car;
import Vertex.javaStart.lesson4.homeWork.homeProject1.someThings.House;

public class Doctor extends Woman {

    Car car;
    House house;
    Animals animals;


    /**
     * Run inserted override method.
     */
    public void feature() {
        femaleFeature();
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

    @Override
    public void femaleFeature() {
        System.out.println("I have not a feature!!!");
    }
}
