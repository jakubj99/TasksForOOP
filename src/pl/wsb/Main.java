package pl.wsb;

import pl.wsb.animal.Animal;

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
    }
}
