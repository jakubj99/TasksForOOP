package pl.wsb;

import pl.wsb.creatures.Pet;
import pl.wsb.database.Connector;
import pl.wsb.devices.Car;
import pl.wsb.devices.CompareCars;
import pl.wsb.devices.Phone;
import pl.wsb.creatures.Human;


import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        Pet dog = new Pet("DOG", "dog", 5.00, 1000.00);
        dog.name = "Borys";


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

        Car gietek = new Car("Volkswagen", "Polo", 2.0, 200,100.0, 2019);
        Car nizooon = new Car("Nissan", "Micra", 1.6, 75, 15.0, 2002);

        Human me = new Human("Jakub", "Jankowski", 55.0, dog, gietek, iPhone, 2000.00, 10000.00);

        System.out.println(dog);

        CompareCars compare = new CompareCars();
        compare.compareCars(gietek, gietek);
        compare.compareCars(gietek, nizooon);

        gietek.turnOn();

        me.setCarInGarage(gietek, 0);
        me.hasACarInGarage(gietek);
        System.out.println(me.getCarFromGarage(0));

        String[] names = {"Jakub", "Kuba", "Santiago", "Jose"};
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        Connector.connect();

    }
}
