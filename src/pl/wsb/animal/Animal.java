package pl.wsb.animal;

import pl.wsb.interfaces.Feedable;

public class Animal implements Feedable {

    public String name;
    public final String species;
    public Double weight;


    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

    public void walk() {

        if (weight > 4.0) {
            System.out.println("thx for walk");
            --weight;
        } else if (weight > 1.0) {
            System.out.println("Feed your pet.");
            --weight;
        } else {
            System.out.println("It's too late {{RIP}}");
        }
    }

    @Override
    public Double feed() {
        System.out.println("thx for food");
        return ++weight;
    }

    @Override
    public void feed2(Double foodWeight) {
        if (weight <= 0){
            System.out.println("animal is dead, sorry...");
        }else{
            weight += foodWeight;
        }
    }
}
