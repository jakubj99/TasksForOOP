package pl.wsb;

import pl.wsb.creatures.Pet;
import pl.wsb.devices.Car;
import pl.wsb.devices.CompareCars;
import pl.wsb.devices.ElectricCar;
import pl.wsb.devices.Phone;
import pl.wsb.creatures.Human;

public class Main {

    public static void main(String[] args) throws Exception {

        Pet dog = new Pet("DOG", "dog", 5.00, 1000.00);
        dog.name = "Borys";

        Pet cat = new Pet("Heviran", "cat", 17.0, 90000.00);


       // dog.feed2(5.2);

        System.out.println(dog.name);
        System.out.println(dog.species);
        System.out.println(dog.weight);

        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();
        dog.walk();

        Phone iPhone = new Phone("Apple", "8", 2017, 2000.00);
        iPhone.turnOn();

        Phone Samsung = new Phone("Samsung", "Galaxy s10", 2018, 2500.00);

        Car gietek = new Car("Volkswagen", "Polo", 2.0, 200,100.0, 2019);
        Car nizooon = new Car("Nissan", "Micra", 1.6, 75, 15.0, 2002);
        ElectricCar taycan = new ElectricCar("Połsie", "Taycan", 100.00, 750, 800000, 2020);

        Human me = new Human("Jakub", "Jankowski", 55.0, dog, gietek, iPhone, 2000.00, 10000.00);
        Human you = new Human("Santiago", "Handerson", 65.5, cat, nizooon, Samsung, 2500.50, 200000.00);

        System.out.println(dog);

        CompareCars compare = new CompareCars();
        compare.compareCars(gietek, gietek);
        compare.compareCars(gietek, nizooon);

        gietek.turnOn();

        me.setCarInGarage(gietek, 0);
        me.hasACarInGarage(gietek);
        System.out.println(me.getCarFromGarage(0));

       gietek.sell(you, me, 30000.00);

    }
}
