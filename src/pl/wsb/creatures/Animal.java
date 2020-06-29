package pl.wsb.creatures;

import pl.wsb.interfaces.Sellable;

public abstract class Animal implements Feedable, Sellable {

    public String name;
    public final String species;
    public Double weight;
    private Double price;

    public Animal(String name, String species, Double weight, Double price) {
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.price = price;
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
        if (weight <= 0) {
            System.out.println("animal is dead, sorry...");
        } else {
            weight += foodWeight;
        }
    }


    @Override
    public boolean sell(Human buyer, Human seller) throws Exception {
        if (seller.getPet().price <= buyer.getCash()) {
            buyer.minusCash(seller.getPet().price);
            seller.plusCash(seller.getPet().price);
            buyer.setPet(seller.getPet());
            seller.setPet(null);
            System.out.println("Your pet has new owner");
            return true;
        } else {
            System.out.println("Not enough cash");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
