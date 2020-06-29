package pl.wsb.interfaces;

import pl.wsb.creatures.Human;

public interface Sellable {
    boolean sell(Human buyer, Human seller) throws Exception;
}
