package Vertex.lesson4.homeWork.professional;

import Vertex.lesson4.homeWork.animals.Animals;
import Vertex.lesson4.homeWork.people.Man;
import Vertex.lesson4.homeWork.someThings.Car;
import Vertex.lesson4.homeWork.someThings.House;

public class Fireman extends Man {

    Car car;
    House house;
    Animals animals;

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
