package pl.wsb.human;

import pl.wsb.animal.Animal;
import pl.wsb.car.Car;

public class Human {

    String firstName;
    String lastName;
    double weight;
    Animal pet;
    Car vehicle;

    public Human(String firstName, String lastName, double weight, Animal pet, Car vehicle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.pet = pet;
        this.vehicle = vehicle;
    }
}
