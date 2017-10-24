package Vertex.javaStart.lesson4.homeWork.homeProject1.profession;

import Vertex.javaStart.lesson4.homeWork.homeProject1.animals.Animals;
import Vertex.javaStart.lesson4.homeWork.homeProject1.people.Man;
import Vertex.javaStart.lesson4.homeWork.homeProject1.someThings.Car;
import Vertex.javaStart.lesson4.homeWork.homeProject1.someThings.House;

public class Fireman extends Man {

    Car car;
    House house;
    Animals animals;

    /**
     * Return some text.
     */
    public static String fire() {
        return "Don`t be afraid of fire!!!";
    }

    @Override
    public void maleFeature() {
        System.out.println("!!!And love his family!!!");
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
