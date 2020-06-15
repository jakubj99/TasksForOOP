package pl.wsb;

import pl.wsb.animal.Animal;
import pl.wsb.devices.Car;
import pl.wsb.devices.CompareCars;
import pl.wsb.human.Human;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("DOG", 5.00);
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

        Car gietek = new Car("Volkswagen", "Polo", 2.0, 200,100.0);
        Car nizooon = new Car("Nissan", "Micra", 1.6, 75, 15.0);

        Human me = new Human("Jakub", "Jankowski", 55.0, dog, gietek);

        System.out.println(dog);

        CompareCars compare = new CompareCars();
        compare.compareCars(gietek, gietek);
        compare.compareCars(gietek, nizooon);


    }
}
