package pl.wsb.creatures;

public class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String name, String species, Double weight, Double price) {
        super(name, species, weight, price);
    }

    @Override
    public void beEaten() {

    }
}
